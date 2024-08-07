n=int(input("enter number upto tables should print"))
count=0
for i in range(1,n+1):
    for j in range(1,11):
        print(i,"*",j,"=",i*j)
        count=count+1
        if(count==10):
            print("\t")
            count=0
