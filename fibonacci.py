n=int(input("Enter range of fibonacci:"))
a=0
b=1
c=0
for i in range(n):
    c=a+b
    a=b
    b=c
    print(c)
