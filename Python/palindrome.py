a=(int)(input("enter a number \n"))
d=a
s=0
while(d>0):
    r=d%10
    s=s*10+r
    d=d/10

print(s)
