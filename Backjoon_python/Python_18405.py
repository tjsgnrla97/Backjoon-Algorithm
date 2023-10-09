#경쟁적 전염
import sys
from collections import deque
input = sys.stdin.readline

n, k = map(int, input().split())
board = []
virus = []
for y in range(n):
    board.append(list(map(int, input().split())))
    for x in range(n):
        if board[y][x] != 0:
            virus.append(((board[y][x], y, x)))

virus.sort()
s, gy, gx = map(int, input().split())

dir = [(1,0),(-1,0),(0,-1),(0,1)]

def bfs():
    dq = deque(virus)
    cnt = 0
    while dq:
        if cnt == s:
            break
        for _ in range(len(dq)):
            virus_num, y, x = dq.popleft()
            for dy, dx in dir:
                ny, nx = y + dy, x + dx
                if 0 <= ny < n and 0 <= nx < n:
                    if board[ny][nx] == 0:
                        board[ny][nx] = board[y][x]
                        dq.append((board[ny][nx], ny, nx))
        cnt += 1
    return board[gy-1][gx-1]

print(bfs())

#시간 초과
# import sys, heapq

# input = sys.stdin.readline

# n,k = map(int, input().split())
# board = [list(map(int, input().split())) for _ in range(n)]
# visited = [[False for _ in range(n)] for _ in range(n)]
# s, gy, gx = map(int, input().split())

# hq = []
# dir = [(1,0),(-1,0),(0,1),(0,-1)]
# while True:
#     if s == 0:
#         break
#     for y in range(n):
#         for x in range(n):
#             if board[y][x] != 0 and not visited[y][x]:
#                 heapq.heappush(hq, (board[y][x], y, x))
#     while hq:
#         virus_num, vy, vx = heapq.heappop(hq)
#         visited[vy][vx] = True
#         for dy, dx in dir:
#             nvy, nvx = vy + dy, vx + dx
#             if 0 <= nvy < n and 0 <= nvx < n and not visited[nvy][nvx] and not board[nvy][nvx]:
#                 board[nvy][nvx] = virus_num
#     s -= 1

# print(board[gy-1][gx-1])