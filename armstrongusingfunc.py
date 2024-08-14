def count(n):
    s=0
    while(n!=0):    
        k=n%10
        s+=1
        n=n//10
    return s
def power (u,b):
    p=1
    for i in range(1,b+1):
        p=p*u
    return p
def armstrong(h):
    m=h
    k=0
    a=0
    k=count(h)
    while(h!=0):
        l=h%10
        a+=power(l,k)
        h=h//10
    if(m==a):
        print("Armstrong")
    else:
        print("Not an armstrong")
n=int(input("Enter n:"))
armstrong(n)
