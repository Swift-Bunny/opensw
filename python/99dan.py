start_dan = int(input("Please enter the value to start : "))
end_dan = int(input("Please enter the value to end : "))
for i in range(start_dan,end_dan+1):
    for j in range(1,10):
        print(i,"X",j,"=",i*j)
    print("\n")