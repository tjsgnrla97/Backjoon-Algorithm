import sys
from collections import deque
input = sys.stdin.readline

N, M = map(int, input().split())

board = [0] * 101
visited = [False] * 101

ladder = dict()
snake = dict()

for _ in range(N):
    start, end = map(int, input().split())
    ladder[start] = end
for _ in range(M):
    start, end = map(int, input().split())
    snake[start] = end

dq = deque([1])

while dq:
    num = dq.popleft()
    if num == 100:
        print(board[num])
        break
    for dice in range(1,7):
        next_num = num + dice
        if next_num <= 100 and not visited[next_num]:
            if next_num in ladder.keys():
                next_num = ladder[next_num]
            if next_num in snake.keys():
                next_num = snake[next_num]
            if not visited[next_num]:
                # print(f"num : {num} & dice : {dice} & next_num : {next_num}")
                visited[next_num] = True
                board[next_num] = board[num] + 1
                dq.append(next_num)