a=(float)(input())
b=float(input())
c=float(input())
if(a==b and b==c and a==c):
    print("equilateral")
elif(a==b or b==c or c==a):
    print("isosceles")
else:
    print("scalene")
