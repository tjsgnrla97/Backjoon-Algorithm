#불
#1. 매초 번질 불 위치 큐 삽입
#2. 상근이 동서남북 이동(다음위치 큐 삽입 1초 걸림)
#3. 불 있는 칸 불이 붙으려는 칸으로 이동 불가
#4. 도착지점 최소 시간 구하기(BFS)
import sys
from collections import deque
input = sys.stdin.readline
dir = [(1,0),(-1,0),(0,1),(0,-1)]

def burn():
    for _ in range(len(fire_dq)):
        y, x = fire_dq.popleft()
        for dy, dx in dir:
            ny = y + dy
            nx = x + dx
            if 0 <= ny < h and 0 <= nx < w:
                if board[ny][nx] != "#" and board[ny][nx] != "*":
                    board[ny][nx] = "*"
                    fire_dq.append((ny,nx))
def move():
    is_move = False
    for _ in range(len(player_dq)):
        y, x = player_dq.popleft()
        for dy, dx in dir:
            ny = y + dy
            nx = x + dx
            if 0 <= ny < h and 0 <= nx < w:
                if visited[ny][nx] == 0 and board[ny][nx] != "#" and board[ny][nx] != "*":
                    is_move = True
                    visited[ny][nx] = visited[y][x] + 1
                    player_dq.append((ny,nx))
            else:
                return visited[y][x]
    if not is_move:
        return "IMPOSSIBLE"
        
tc = int(input())
for _ in range(tc):
    w, h = map(int, input().split())
    board = [list(input().strip()) for _ in range(h)]
    fire_dq = deque()
    player_dq = deque()
    for y in range(h):
        for x in range(w):
            if board[y][x] == "@":
                player_dq.append((y,x))
            if board[y][x] == "*":
                fire_dq.append((y,x))
    visited = [[0 for _ in range(w)] for _ in range(h)]
    visited[player_dq[0][0]][player_dq[0][1]] = 1
    
    ans = 0
    
    while True:
        burn()
        ans = move()
        if ans:
            break
    print(ans)
# from collections import deque
# import sys
# input = sys.stdin.readline
# dx = [0, 1, 0, -1]
# dy = [1, 0, -1, 0]


# def burn():
#     for _ in range(len(fire)):
#         x, y = fire.popleft()
#         for k in range(4):
#             nx = x + dx[k]
#             ny = y + dy[k]
#             if 0 <= nx < N and 0 <= ny < M:
#                 if arr[nx][ny] != '#' and arr[nx][ny] != '*':
#                     arr[nx][ny] = '*'
#                     fire.append((nx, ny))


# def move():
#     isgo = False
#     for _ in range(len(start)):
#         x, y = start.popleft()
#         for k in range(4):
#             nx = x + dx[k]
#             ny = y + dy[k]
#             if 0 <= nx < N and 0 <= ny < M:
#                 if visited[nx][ny] == 0 and arr[nx][ny] != '#' and arr[nx][ny] != '*':
#                     isgo = True
#                     visited[nx][ny] = visited[x][y] + 1
#                     start.append((nx, ny))
#             else:
#                 return visited[x][y]
#     if not isgo:
#         return 'IMPOSSIBLE'


# T = int(input())
# for _ in range(T):
#     M, N = map(int, input().split())
#     arr = []
#     fire = deque()
#     start = deque()
#     for i in range(N):
#         arr.append(list(input().strip()))
#         for j in range(M):
#             if arr[i][j] == '*':
#                 fire.append((i, j))
#             if arr[i][j] == '@':
#                 start.append((i, j))
#     visited = [[0] * M for _ in range(N)]
#     visited[start[0][0]][start[0][1]] = 1

#     result = 0
#     while True:
#         burn()
#         result = move()
#         if result:
#             break

#     print(result)