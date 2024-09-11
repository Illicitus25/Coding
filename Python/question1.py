a=(input("enter a string\n"))
b=(input("enter substring to find\n"))
if(b in a):
    c=a.find(b)
    d=b[len(b)-1]
    e=a.find(d)
    f=a[c:e+1]
    f=f.upper()
    print(a[0:c]+f+a[e+1:])
else:
    print("not present")


