# #케빈 베이컨의 6단계 법칙
# import sys
# from collections import deque

# def bfs(friends, start):
#     num = [0] * (n+1)
#     isVisited = [start]
#     dq = deque()
#     dq.append(start)

#     while dq:
#         start_friend = dq.popleft()
#         for end_friend in friends[start_friend]:
#             if end_friend not in isVisited:
#                 num[end_friend] = num[start_friend] + 1
#                 isVisited.append(end_friend)
#                 dq.append(end_friend)
#     return sum(num)

# input = sys.stdin.readline
# n, m = map(int, input().split())
# friends = [[] for _ in range(n+1)]

# ans = []
# for _ in range(m):
#     start, end = map(int, input().split())
#     friends[start].append(end)
#     friends[end].append(start)

# for start in range(1,n+1):
#     ans.append(bfs(friends, start))

# print(ans.index(min(ans))+1)

import sys
from collections import deque

input = sys.stdin.readline
MIN = int(1e9)
ans = 0
n, m = map(int, input().split())
friends = [[0] * (n+1) for _ in range(n+1)]
for _ in range(m):
    start, end = map(int, input().split())
    friends[start][end] = friends[end][start] = 1

for k in range(1,n+1):
    for start in range(1,n+1):
        for end in range(1,n+1):
            if start == end:
                continue
            
            if friends[start][k] and friends[k][end]:
                if friends[start][end] == 0:
                    friends[start][end] = friends[start][k] + friends[k][end]
                else:
                    friends[start][end] = min(friends[start][end] , friends[start][k] + friends[k][end])

for start in range(1,n+1):
    temp = 0
    for end in range(1,n+1):
        temp += friends[start][end]
    if MIN > temp:
        MIN = temp
        ans = start
print(ans)
