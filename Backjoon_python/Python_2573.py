#빙산
import sys
from collections import deque

input = sys.stdin.readline
n, m = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]

ice = []
for y in range(n):
    for x in range(m):
        if graph[y][x]:
            ice.append((y,x))

dy = [-1,1,0,0]
dx = [0,0,-1,1]

ans = 0

def melt_ice(startY,startX):
    dq = deque([(startY,startX)])
    isVisited[startY][startX] = 1
    seaList = []

    while dq:
        y,x = dq.popleft()
        sea = 0
        for d in range(4):
            ny = y + dy[d]
            nx = x + dx[d]
            if 0 <= ny < n and 0 <= nx < m:
                if not graph[ny][nx]:
                    sea += 1
                elif graph[ny][nx] and not isVisited[ny][nx]:
                    dq.append((ny,nx))
                    isVisited[ny][nx] = 1
        if sea > 0:
            seaList.append((y, x, sea))
    for y, x, sea in seaList:
        graph[y][x] = max(0, graph[y][x] - sea)
    return 1

while ice:
    isVisited = [[0]*m for _ in range(n)]
    meltList = []
    ice_area = 0
    for y,x in ice:
        if graph[y][x] and not isVisited[y][x]:
            ice_area += melt_ice(y,x)
        if graph[y][x] == 0:
            meltList.append((y,x))
    if ice_area > 1:
        print(ans)
        break
    ice = sorted(list(set(ice)-set(meltList)))
    ans += 1

if ice_area < 2:
    print(0)
        