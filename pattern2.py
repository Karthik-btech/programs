n=int(input("Enter no of rows"))
k=1
z=0
j=0
for i in range(n):
    z=z+1
    for j in range(n,j,-1):
        print("*",end='')
    for k in range(1,n+1):
        print("  ",end='')
    print(end='\n')
