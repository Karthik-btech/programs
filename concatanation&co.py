x=[1,2,3,4,5]
y=[9,8,7,6]
z=x+y
print("Concatenation:",z)
p=x*2
print("Repeatition:",p)
a=7
print("Membership:",a in x)
print("Membership:",a in y)
a=x
print(a)
print(x)
a[0]=44
print("Aliasing")
print(a)
print(x)
print(   )
b=x[:]
print(b)
print(x)
print("Cloning")
x[2]=999
print(x)
print(b)
