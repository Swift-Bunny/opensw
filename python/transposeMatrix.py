def transpose(matrix):
    # 주어진 행렬의 전치행렬을 반환합니다.
    return [[row[i] for row in matrix] for i in range(len(matrix[0]))]

# 예제 행렬
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

# 전치행렬 출력
transposed = transpose(matrix)
for row in transposed:
    print(row)