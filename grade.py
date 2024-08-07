m=int(input("Enter marks:"))
if(m>=90):
    print("s-grade")
elif(m<90 and m>=80):
    print("a-grade")
elif(m<80 and m>=70):
    print("b-grade")
elif(m<70 and m>=60):
    print("c-grade")
elif(m<60 and m>=50):
    print("d-grade")
else:
    print("Fail")
