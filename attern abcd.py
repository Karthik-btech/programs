n=int(input("Enter n value"))
k=65
for i in range(n+1):
    for j in range(65,65+i,1):
        print("%c"%j,end='')
    print()
