a=input("enter mobile no.")
if(a.isdigit() and len(a)==10):
    if(int(a[0])>=6 and int(a[0])<=9):
        print("valid")
    else:
        print("invalid")
else:
    print("invalid")
