n=int(input("Enter no of rows"))
k=1
z=n
for i in range(n):
    for k in range(1,z+1):
            print(" ",end='')
    for j in range(1,i+1):
        print("* ",end='')
    print(end='\n')
    z=z-1
            


    
