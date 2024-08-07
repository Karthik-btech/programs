n=int(input("Enter n value"))
r=0
k=0
while(n!=0):
    r=n%10
    k+=r
    n=n//10
print("The sum:",k)
