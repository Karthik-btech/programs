def factorial(n):
    if(n==1):
        return 1
    else:
        return(n*factorial(n-1))
def strong(n):
    m=n
    s=0
    while(n!=0):
        k=n%10
        s=s+factorial(k)
        n=n//10
    if(m==s):
        print("Strong")
    else:
        print("Not Strong")
n=int(input("Enter n:"))
strong(n)
