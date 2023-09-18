#음식물 피하기
import sys
from collections import deque
input = sys.stdin.readline

N,M,K = map(int, input().split())
boad = [[0] * (M+1) for _ in range(N+1)]
isVisited = [[False] * (M+1) for _ in range(N+1)]
ans = 0
dir = [[1,0],[-1,0],[0,-1],[0,1]]

for _ in range(K):
    y, x = map(int, input().split())
    boad[y][x] = 1

def bfs(startY, startX):
    global ans
    isVisited[startY][startX] = True
    cnt = 1
    dq = deque([(startY, startX)])
    while dq:
        y, x = dq.popleft()
        for dy, dx in dir:
            ny = y + dy
            nx = x + dx
            if 0 <= ny < N+1 and 0 <= nx < M+1 and not isVisited[ny][nx] and boad[ny][nx] == 1:
                isVisited[ny][nx] = True
                cnt += 1
                dq.append((ny,nx))
    ans = max(ans, cnt)

for y in range(1,N+1):
    for x in range(1,M+1):
        if boad[y][x] == 1:
            bfs(y,x)

print(ans)