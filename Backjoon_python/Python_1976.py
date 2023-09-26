#여행 가자
import sys
from collections import deque
input = sys.stdin.readline
#유니온 파인드
# 그래프의 모든 간선 정보가 주어졌을 때, 
# 유니온 파인드를 이용해 특정 정점부터 특정 정점까지 
# 이어져있는지 손쉽게 확인할 수 있다.
# 그 점을 이용하여 문제를 해결한다.

n = int(input())
m = int(input())
city = [list(map(int, input().split())) for _ in range(n)]
parents = list(range(n))
plan = list(map(int, input().split()))

def find(a):
    if parents[a] != a:
        parents[a] = find(parents[a])
    return parents[a]

def union(a,b):
    a = find(a)
    b = find(b)
    if a > b:
        parents[a] = b
    else:
        parents[b] = a

for start in range(n):
    for end in range(n):
        if city[start][end] == 1:
            union(start,end)

ans = "YES"
for i in range(1,m):
    if parents[plan[i]-1] != parents[plan[0]-1]:
        ans = "NO"
        break
print(ans)

# from collections import deque

# def bfs(adj, start, visit):
#     q = deque()
#     q.append(start)
#     visit[start] = 1
#     while q:
#         node = q.popleft()

#         for idx, item in enumerate(adj[node]):
#             if item and visit[idx] == 0:
#                 visit[idx] = 1
#                 q.append(idx)

# n = int(input())
# m = int(input())

# adj = []
# visit = [0] * n
# for _ in range(n):
#     adj.append(list(map(int, input().split())))
# city = list(map(int,input().split()))
# start = city[0] - 1

# bfs(adj, start, visit)
# flag = True
# for item in city:
#     if visit[item-1] == 0:
#         flag = False
# if flag:
#     print('YES')
# else:
#     print('NO')