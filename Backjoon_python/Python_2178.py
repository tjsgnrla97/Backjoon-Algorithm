#미로 탐색
import sys
from collections import deque
input = sys.stdin.readline
n, m = map(int,input().split())
mapping = []

for _ in range(n):
    #readline 맨 뒤 '\n'까지 입력받으므로 제거해줘야함
    mapping.append(list(map(int,input().rstrip())))

dy = [-1,1,0,0]
dx = [0,0,-1,1]

def bfs(startY,startX):
    q = deque()
    q.append((startY,startX))
    while q:
        y,x = q.popleft()
        for d in range(4):
            ny = y+dy[d]
            nx = x+dx[d]
            if 0<=ny<n and 0<=nx<m and mapping[ny][nx]==1:
                q.append((ny,nx))
                mapping[ny][nx]=mapping[y][x]+1
    return mapping[n-1][m-1]

print(bfs(0,0))