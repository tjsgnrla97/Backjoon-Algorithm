#임시 반장 정하기
n = int(input())
c =  []
same = [0] * n
for i in range(n):
    c.append(list(map(int,input().split())))
    same[i] = [0] * n

for i in range(5):
    for j in range(n):
        for k in range(j+1,n):
            if c[j][i] == c[k][i]:
                same[k][j] = 1
                same[j][k] = 1

ans = []
for s in same:
    ans.append(s.count(1))

print(ans.index(max(ans))+1)
