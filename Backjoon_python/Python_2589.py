#보물섬
# import sys
# from collections import deque
# input = sys.stdin.readline

# N, M = map(int, input().split())
# island = [list(map(str,input().rstrip())) for _ in range(N)]

# ans = 0
# dir = [(1,0), (-1,0), (0,-1), (0,1)]

# def bfs(startY,startX):
#     global ans
#     isVisited = [[False] * M for _ in range(N)]
#     isVisited[startY][startX] = True
#     dq = deque([(startY,startX,0)])   
#     while dq:
#         currentY,currentX,currentTime = dq.popleft()
#         ans = max(ans, currentTime)
#         for dy, dx in dir:
#             ny = currentY+dy
#             nx = currentX+dx
#             if 0 <= ny < N and 0 <= nx < M and not isVisited[ny][nx] and island[ny][nx]=="L":
#                 isVisited[ny][nx] = True
#                 dq.append((ny,nx,currentTime+1))

# for y in range(N):
#     for x in range(M):
#         if island[y][x] == "L":
#             bfs(y,x)
# print(ans)

import sys
from collections import deque
input = sys.stdin.readline

N, M = map(int, input().split())
island = [list(map(str, input().rstrip())) for _ in range(N)]
dq = deque()
dir = [(1,0),(-1,0),(0,-1),(0,1)]
ans = 0

def bfs(startY, startX):
    global ans
    dq.append((startY,startX,0))
    isVisited = [[False]*M for _ in range(N)]
    isVisited[startY][startX] = True
    while dq:
        currentY, currentX, currentTime = dq.popleft()
        ans = max(ans, currentTime)
        for dy, dx in dir:
            ny = currentY + dy
            nx = currentX + dx
            if 0 <= ny < N and 0 <= nx < M and island[ny][nx] == "L" and not isVisited[ny][nx]:
                isVisited[ny][nx] = True
                dq.append((ny,nx,currentTime+1))

for y in range(N):
    for x in range(M):
        if island[y][x] == "L":
            bfs(y,x)
print(ans)