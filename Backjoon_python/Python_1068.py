#트리
import sys
input = sys.stdin.readline

n=int(input())
vList = list(map(int,input().split()))
delete = int(input())

ans=0

def dfs(num):
    vList[num] = -2
    for i in range(n):
        if num == vList[i]:
            dfs(i)

dfs(delete)

for i in range(n):
    if vList[i] != -2 and i not in vList:
        ans += 1

print(ans)