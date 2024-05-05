#Gnome Sequencing
print("Gnomes:")
for i in range(int(input())):
    a,b,c=map(int,input().split())
    li = [a,b,c]
    if sorted(li,reverse=True)==li or sorted(li,reverse=False)==li:
        print("Ordered")
    else:
        print("Unordered")