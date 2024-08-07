n=int(input("Enter no of units consumed"))
u=0
rate=0
if(n<=200):
    rate=1.5*n
elif(n>200 and n<=400):
    rate=(2*(u-200)+(1.5*200)+500)
elif(n>400 and n<=600):
    rate=((1000+5*(u-400))+((2*200)+500)+(1.5*200))
else:
    rate=(1500+(20*(u-600))+(1000+5*200)+(2*200)+(500+1.5*200))
print("Electricity Bill:",rate)
