#개표
v = int(input())
a,b=0,0
msg = input()
for i in range(v):
    if msg[i]=="A":
        a+=1
    else:
        b+=1
if a>b:
    print("A")
elif b>a:
    print("B")
else:
    print("Tie")