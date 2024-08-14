def factor(n):
    s=0
    for i in range(1,n):
        if(n%i==0):
            s+=i
    return s
def perfect(n):
    k=0
    k=factor(n)
    if(k==n):
        print("Perfect")
    else:
        print("Not a Perfect")
n=int(input("Enter n:"))
perfect(n)
