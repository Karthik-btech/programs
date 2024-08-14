def gcd(a,b):
    c=0
    if(c==0):
        return b
    else:
        c=b%a
        a=b
        b=c
        return(a,b)
n=int(input("Enter a"))
m=int(input("Enter b"))
k=gcd(n,m)
print(k)
