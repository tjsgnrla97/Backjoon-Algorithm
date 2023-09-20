#불!
import sys
from collections import deque
input = sys.stdin.readline

R, C = map(int, input().split())
board = []

dq_player = deque([])
dq_fire = deque([])

visited_player = [[0] * C for _ in range(R)]
visited_fire = [[0] * C for _ in range(R)]

dir = [(1,0),(-1,0),(0,1),(0,-1)]

for y in range(R):
    board_line = list(input())
    for x in range(C):
        if board_line[x] == "J":
            dq_player.append((y,x))
            visited_player[y][x] = 1
        elif board_line[x] == "F":
            dq_fire.append((y,x))
            visited_fire[y][x] = 1
    board.append(board_line)

def bfs():
    while dq_fire:
        y, x = dq_fire.popleft()

        for dy, dx in dir:
            ny, nx = y + dy, x + dx
            if 0 <= ny < R and 0 <= nx < C:
                if not visited_fire[ny][nx] and board[ny][nx] != "#":
                    visited_fire[ny][nx] = visited_fire[y][x] + 1
                    dq_fire.append((ny,nx))

    while dq_player:
        y, x = dq_player.popleft()

        for dy, dx in dir:
            ny, nx = y + dy, x + dx
            if 0 <= ny < R and 0 <= nx < C:
                if not visited_player[ny][nx] and board[ny][nx] != "#":
                    if not visited_fire[ny][nx] or visited_player[y][x] + 1 < visited_fire[ny][nx]:
                        visited_player[ny][nx] = visited_player[y][x] + 1
                        dq_player.append((ny,nx))
            else:
                return visited_player[y][x]
            
    return "IMPOSSIBLE"
print(bfs())