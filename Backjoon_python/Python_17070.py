#파이프 옮기기 1
import sys
input = sys.stdin.readline
n = int(input())
board = [list(map(int, input().split())) for _ in range(n)]
#dp[0][y][x] = (현재칸을 끝으로 하는)가로 파이프 개수에 대한 dp
#dp[1][y][x] = 대각선 파이프에 대한 dp
#dp[2][y][x] = 세로 파이프에 대한 dp
dp = [[[0 for _ in range(n)] for _ in range(n)] for _ in range(3)]

# 1행 먼저 처리하기
dp[0][0][1] = 1
for x in range(2, n):
    if board[0][x] == 0:
        dp[0][0][x] = dp[0][0][x-1]
# 1행과 1열 제외
for y in range(1,n):
    for x in range(1,n):
        #대각선 파이프 추가하는 과정
        if board[y][x] == 0 and board[y][x-1] == 0 and board[y-1][x] == 0:
            dp[1][y][x] = dp[0][y-1][x-1] + dp[1][y-1][x-1] + dp[2][y-1][x-1]
        #가로, 세로 파이프 추가하는 과정
        if board[y][x] == 0:
            dp[0][y][x] = dp[0][y][x-1] + dp[1][y][x-1]
            dp[2][y][x] = dp[2][y-1][x] + dp[1][y-1][x]

print(sum(dp[dir][n-1][n-1] for dir in range(3)))

# from collections import deque
# import sys

# count = 0
# N = int(input())
# home = []
# for _ in range(N):
#     home.append([int(x) for x in sys.stdin.readline().rstrip().split()])

# def bfs():
#     global count
#     deq = deque()
#     deq.append([0,1,0]) # 0 가로 1 세로 2 대각선

#     while deq:
#         x, y, state = deq.popleft()
#         if x == N - 1 and y == N - 1:
#             count += 1
#             continue

#         if state == 0:
#             if y == N - 1:
#                 continue

#             if 0 <= x < N and 0 <= y + 1 < N and home[x][y + 1] == 0:
#                 deq.append([x, y + 1, 0])

#             if 0 <= x + 1 < N and 0 <= y + 1 < N and home[x][y + 1] == 0 and home[x + 1][y] == 0 and home[x + 1][y + 1] == 0:
#                 deq.append([x + 1, y + 1, 2])

#         elif state == 1:
#             if x == N - 1:
#                 continue

#             if 0 <= x + 1 < N and 0 <= y < N and home[x + 1][y] == 0:
#                 deq.append([x + 1, y, 1])

#             if 0 <= x + 1 < N and 0 <= y + 1 < N and home[x][y + 1] == 0 and home[x + 1][y] == 0 and home[x + 1][y + 1] == 0:
#                 deq.append([x + 1, y + 1, 2])

#         elif state == 2:

#             if 0 <= x < N and 0 <= y + 1 < N and home[x][y + 1] == 0:
#                 deq.append([x, y + 1, 0])

#             if 0 <= x + 1 < N and 0 <= y < N and home[x + 1][y] == 0:
#                 deq.append([x + 1, y, 1])

#             if 0 <= x + 1 < N and 0 <= y + 1 < N and home[x][y + 1] == 0 and home[x + 1][y] == 0 and home[x + 1][y + 1] == 0:
#                 deq.append([x + 1, y + 1, 2])
                
# bfs()
# print(count)

# import sys
# count = 0
# N = int(input())
# home = []

# for _ in range(N):
#     home.append([int(x) for x in sys.stdin.readline().rstrip().split()])

# def dfs(x,y,state): # state 0: 가로, 1: 세로 , 2: 대각선
#     global count
#     if x == N - 1 and y == N - 1:
#         count += 1
#         return

#     if state == 0:
#         if y == N - 1: # 이동불가
#             return

#         if 0 <= x < N and 0 <= y + 1 < N and home[x][y + 1] == 0:
#             dfs(x, y + 1, 0)

#         if 0 <= x + 1 < N and 0 <= y + 1 < N and home[x][y + 1] == 0 and home[x + 1][y] == 0 and home[x + 1][
#             y + 1] == 0:
#             dfs(x + 1, y + 1, 2)

#     elif state == 1:
#         if x == N - 1: # 이동불가
#             return

#         if 0 <= x + 1 < N and 0 <= y < N and home[x + 1][y] == 0:
#             dfs(x + 1, y, 1)

#         if 0 <= x + 1 < N and 0 <= y + 1 < N and home[x][y + 1] == 0 and home[x + 1][y] == 0 and home[x + 1][
#             y + 1] == 0:
#             dfs(x + 1, y + 1, 2)

#     elif state == 2:
#         if 0 <= x < N and 0 <= y + 1 < N and home[x][y + 1] == 0:
#             dfs(x, y + 1, 0)

#         if 0 <= x + 1 < N and 0 <= y < N and home[x + 1][y] == 0:
#             dfs(x + 1, y, 1)

#         if 0 <= x + 1 < N and 0 <= y + 1 < N and home[x][y + 1] == 0 and home[x + 1][y] == 0 and home[x + 1][
#             y + 1] == 0:
#             dfs(x + 1, y + 1, 2)

# dfs(0,1,0)
# print(count)