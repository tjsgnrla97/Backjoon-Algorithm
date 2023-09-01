#마인크래프트
import sys
input = sys.stdin.readline
n,m,b = map(int, input().split())

lst = [list(map(int, input().split())) for _ in range(n)]

ans_time = int(1e9)
ans_height = 0
minh = min(min(lst))
maxh = max(max(lst))
for height in range(minh, maxh+1):
    max = 0
    min = 0
    for y in range(n):
        for x in range(m):
            if lst[y][x] < height:
                min += (height - lst[y][x])
            elif lst[y][x] >= height:
                max += (lst[y][x] - height)
    inventory = max + b
    if inventory < min:
        continue
    time = 2 * max + min
    if time <= ans_time:
        ans_time = time
        ans_height = height
print(ans_time, ans_height)

# import sys
# input = sys.stdin.readline

# N, M, B = map(int, input().split())  # B: 인벤토리에 있는 블록 갯수
# heights = {}

# minH = 0
# maxH = 257
# for _ in range(N):
#     temp = list(map(int, input().split()))
#     # 해당 높이의 블록 갯수 count
#     for i in temp:
#         heights[i] = heights.get(i, 0)+1

# resultSec = float('inf')
# resultH = 0

# for h in range(257):
#     minus, plus = 0, 0
#     for block in heights:
#         if block < h:  # 블록 빼기
#             minus += (h - block) * heights[block]
#         elif h < block:  # 블록 쌓기
#             plus += (block - h) * heights[block]
#     leftBlock = B + plus  # 뺀 블록을 포함해 인벤토리에 남은 블록
#     if leftBlock < minus:  # 인벤토리에 있는 블록보다 쌓아야할 블록이 많은 경우
#         continue
#     time = 2 * large + small

#     if time <= resultSec:  # 높이가 가장 큰 값으로 갱신
#         resultH = h
#         resultSec = time

# print(resultSec, end=" ")
# print(resultH)