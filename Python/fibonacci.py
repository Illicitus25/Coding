end=int(input())
a=0
b=1
s=0
print(a)
print(b)
while(a+b<end):
    s=a+b
    print(s,end=",")
    a=b
    b=s
