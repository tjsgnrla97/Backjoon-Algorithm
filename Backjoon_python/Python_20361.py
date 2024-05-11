#일우는 야바위꾼
n,x,k = map(int,input().split())
li = []
for i in range(n):
    li.append(i+1)
change = [list(map(int,input().split())) for _ in range(k)]

for i in range(k):
    li[change[i][0]-1], li[change[i][1]-1] = li[change[i][1]-1],li[change[i][0]-1]
print(li.index(x)+1)