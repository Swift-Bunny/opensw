#include <stdio.h>
#include <string.h>

#define MAX_STACK_SIZE 100

typedef struct {
	int top;
	char stack[MAX_STACK_SIZE];
} StackType;

void init(StackType *s) { s->top = -1; }

int is_empty(StackType *s) { return (s->top == -1); }

int is_full(StackType *s) { return (s->top == (MAX_STACK_SIZE-1)); }

void push(StackType *s,char data) {
	if(is_full(s)) { printf("OVERFLOW!!\n"); return; }
    s->stack[++(s->top)] = data;
}

char pop(StackType *s) {
	if(is_empty(s)) { printf("UNDERFLOW!!\n"); return; }
	return s->stack[(s->top)--];
}

char peek(StackType *s) {
	if(is_empty(s)) { printf("UNDERFLOW!!\n"); return; }
	return s->stack[s->top];
}

int prec(char ch) {
	if(ch == '+' || ch == '-') return 3;
	else if(ch == '*' || ch == '/') return 4;
	else if(ch == ')') return 2;
	else if(ch == '(') return 1;
}

int calc(char formula[]) {
	int op1, op2, value, k=0;
	int len = strlen(formula);
	char ch;
	StackType s;

	init(&s);

    for (k = 0; k < len; k++) {
        ch = formula[k];
		if(ch != '+' && ch != '-' && ch != '*' && ch != '/') {
			value = ch - '0';
			push(&s, value);
		} else {
			op2 = pop(&s);
			op1 = pop(&s);
			switch(ch) {
			case '+': push(&s, op1 + op2); break;
            case '-': push(&s, op1 - op2); break;
            case '*': push(&s, op1 * op2); break;
            case '/': push(&s, op1 / op2); break;
			}
		}
    } return pop(&s);   
}

void infix_to_postfix(char exp[]) {
	int k=0, count=0;
	int len = strlen(exp);
	char ch, top_op, formula[MAX_STACK_SIZE] = { 0 };
	StackType s;
	init(&s);

	for(k=0; k < len; k++) {
		ch = exp[k];
		switch(ch) {
		case '+': case '-': case '*': case '/':
			while(!is_empty(&s) && (prec(ch) <= prec(peek(&s))))
				formula[count++] = pop(&s);
			push(&s, ch);
			break;
		case '(':
			push(&s, ch);
			break;
		case ')':
			top_op = pop(&s);
			while(top_op != '(') {
				formula[count++] = top_op;
				top_op = pop(&s);
			}
			break;
		default:
			formula[count++] = ch;
			break;
		}
	}

	while(!is_empty(&s)) {
		formula[count++] = pop(&s);
	} printf("%s", formula);

	printf("\n계산값: %d\n", calc(formula));
}

int main() {
	infix_to_postfix("1+(3*(4/2)-5*(6+7)-8+9)");
}