import sys
from collections import deque

input = sys.stdin.readline

n, m, k = map(int, input().split())

maps = [[0]*m for _ in range(n)]

for _ in range(k):
    x1,y1,x2,y2 = map(int,input().split())
    for y in range(y1,y2):
        for x in range(x1,x2):
            maps[y][x] = 1

dy = [-1,1,0,0]
dx = [0,0,-1,1]

ans=1
area=[]

def bfs(startY,startX):
    global ans
    q = deque()
    q.append([startY,startX])
    maps[startY][startX]=2
    while q:
        y,x = q.popleft()
        for d in range(4):
            ny,nx = y+dy[d], x+dx[d]
            if 0<=ny<n and 0<=nx<m and maps[ny][nx]==0:
                ans+=1
                maps[ny][nx]=2
                q.append([ny,nx])
    return ans

for y in range(n):
    for x in range(m):
        if maps[y][x]==0:
            ans=bfs(y,x)
            area.append(ans)
            ans=1

area.sort()
print(len(area))
for result in area:
    print(result, end=" ")