#내리막 길
import sys
sys.setrecursionlimit(10 ** 9)

input = sys.stdin.readline

n,m = map(int,input().split())
maps = [list(map(int,input().split())) for _ in range(n)]
isVisited = [[-1]*m for _ in range(n)]

ans=0

dy = [-1,1,0,0]
dx = [0,0,-1,1]

def dfs(startY,startX):
    #목적지 도착시 해당경로 내 모든 배열값 추가
    if startY==n-1 and startX==m-1:
        return 1
    #이미 방문한 곳이면 해당 좌표에서 도착 가능한 모든 경로의 수 추가
    if isVisited[startY][startX] != -1:
        return isVisited[startY][startX]
    
    #방문하지 않은 곳이면 방문했지만 아직 경로완성을 찾지 못했다는 의미로 0으로 초기화
    isVisited[startY][startX]=0
    
    #4방탐색
    for d in range(4):
        ny, nx = startY+dy[d], startX+dx[d]
        if 0<=ny<n and 0<=nx<m and maps[startY][startX]>maps[ny][nx]:
            isVisited[startY][startX] += dfs(ny,nx)
    
    return isVisited[startY][startX]
print(dfs(0,0))