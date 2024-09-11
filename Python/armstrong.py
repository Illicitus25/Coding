a=(int)(input("enter a number \n"))
l=len(str(a))
d=a
s=0
while(d>0):
    r=d%10
    s=s+(r**l)
    d=d//10

if(s==a):
    print(a,"is an armstrong number")
else:
    print(a,"is not an armstrong number")

