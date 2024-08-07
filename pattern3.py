n=int(input("Enter no of rows"))
for i in range(1,n+1):
    for k in range(1,i+1):
        print(" ",end='')
    for j in range(1,n+1):
        print("*",end='')
    print()
