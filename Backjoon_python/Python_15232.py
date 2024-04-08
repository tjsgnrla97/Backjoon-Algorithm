#Rectangles
r = int(input())
c = int(input())
li = [["*" for _ in range(c)] for _ in range(r)]
for y in li:
    for x in y:
        print(x,end='')
    print()