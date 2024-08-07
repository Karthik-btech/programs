import math
n=int(input("Enter n"))
m=n
r=0
k=0
sum1=0
while(n!=0):
    r=n%10
    k=math.factorial(r)
    sum1+=k
    n=n//10
if(sum1==m):
    print("strong number")
else:
    print("not strong number")
    
