#미로만들기
import sys, heapq
input = sys.stdin.readline
INF = 2147000000
n = int(input())
board = [list(map(int, input().rstrip())) for _ in range(n)]
visited = [[INF for _ in range(n)] for _ in range(n)]
dir = [(1,0),(-1,0),(0,1),(0,-1)]

#다익스트라
def dijkstra(wall,y,x):
    hq = []
    heapq.heappush(hq,(wall,y,x))
    visited[y][x] = wall
    while hq:
        ans, current_y, current_x = heapq.heappop(hq)
        if current_y == n-1 and current_x == n-1:
            print(ans)
            break
        for dy, dx in dir:
            ny, nx = current_y + dy, current_x + dx
            if 0 <= ny < n and 0 <= nx < n and visited[ny][nx] > ans + 1:
                #벽일경우 ans + 1 통로일 경우 ans
                if board[ny][nx] == 0:
                    visited[ny][nx] = min(visited[ny][nx],ans+1)
                else:
                    visited[ny][nx] = min(visited[ny][nx],ans)
                heapq.heappush(hq, (visited[ny][nx],ny,nx))

dijkstra(0,0,0)