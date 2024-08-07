n=int(input("Enter n value"))
rev=0
m=n
k=0
r=0
while(n!=0):
   r=n%10
   rev=rev*10+r
   n=n//10
if(rev==m):
    print("palindrome")
else:
    print("not palindrome")
