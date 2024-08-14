def reverse(n):
    r=0
    m=n
    while(n!=0):
        k=n%10
        r=r*10+k
        n=n//10
    if(m==r):
        print("Palindrome")
    else:
        print("Not a palindrome")
n=int(input("Enter n:"))
reverse(n
        )
