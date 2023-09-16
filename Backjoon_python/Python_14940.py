#쉬운 최단거리
import sys
from collections import deque

def bfs():
    while dq:
        y, x = dq.popleft()
        for dy, dx in dir:
            ny, nx = y+dy, x+dx

            if 0 <= ny < n and 0 <= nx < m and not isVisited[ny][nx] and mapping[ny][nx] == 1:
                dq.append((ny,nx))
                isVisited[ny][nx] = True
                ans[ny][nx] = ans[y][x] + 1

input = sys.stdin.readline
n, m = map(int, input().split())
mapping = [list(map(int, input().split())) for _ in range(n)]
isVisited = [[False]*m for _ in range(n)]
ans = [[-1] * m for _ in range(n)]

dq = deque([])
dir = [(1,0),(-1,0),(0,1),(0,-1)]

for y in range(n):
    for x in range(m):
        if mapping[y][x] == 2:
            dq.append((y,x))
            isVisited[y][x] = True
            ans[y][x] = 0
        if mapping[y][x] == 0:
            ans[y][x] = 0

bfs()

for y in ans:
    for x in y:
        print(x, end=" ")
    print()