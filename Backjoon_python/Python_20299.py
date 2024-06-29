#3대 측정
import sys
input = sys.stdin.readline

n,k,l = map(int,input().split())
cnt = 0
ans = []
for _ in range(n):
    team = list(map(int,input().split()))
    flag = True
    for i in team:
        if i < l:
            flag = False
            break
    if flag:
        if sum(team) >= k:
            ans.extend(team)
            cnt += 1
print(cnt)
print(*ans)