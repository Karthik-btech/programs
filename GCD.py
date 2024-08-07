a=int(input("Enter a:"))
b=int(input("Enter b:"))
while(a!=0):
     c=b%a
     b=a
     a=c
print("The GCD is:",b)
