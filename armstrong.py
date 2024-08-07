n=int(input("Enter n:"))
r=0
k=0
m=n
s=m
count=0
while(m!=0):
       count=count+1
       m=m//10
while(n!=0):
    r=n%10
    k=k+r**count
    n=n//10
if(s==k):
    print("armstrong")
else:
    print("not armstrong")
    
