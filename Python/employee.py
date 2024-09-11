l=[]
for i in range(int(input())):
    name = input()
    score = float(input())
    l.append([name,score])
l.sort()
print(l)
