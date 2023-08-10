#성 지키기
import sys
input = sys.stdin.readline

n,m = map(int, input().split())
board = []
for _ in range(n):
    board.append(input())

raw, col = 0, 0

for y in range(n):
    if "X" not in board[y]:
        raw += 1

for x in range(m):
    if "X" not in [board[y][x] for y in range(n)]:
        col += 1

print(max(raw,col))