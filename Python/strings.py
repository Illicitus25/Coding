a="python is a high level language"
print(a[len(a)-2])
#program to print second last character of a string
print(a[::-1])
#program to print the reverse of a statement
print("level" in a)
#returns true if the string contains level else returns false
b=a.index(" ")
#index of " " i.e. 6
c=a.rindex(" ")
#last index of " " i.e. 22
print(a[:b]+a[c:])
#program to print first and last words in a string
word=a.split()
#splits word and arranges them in an array
if(word[0]=="python"):
    print("string starts with the word python")
#program which return true if the string starts with python as first word
i=5
while(i>=0):
    print(word[i],end=' ')
    i=i-1
#program to print the reverse(words) of a string
print(list(enumerate(a)))
#prints index of each element in the form of a list(array)
