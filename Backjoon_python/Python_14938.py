#서강그라운드
import sys
input = sys.stdin.readline
INF = int(1e9)

n,m,r = map(int, input().split())

items = [-1] + list(map(int, input().split()))

distance = [[INF for _ in range(n+1)] for _ in range(n+1)]

for i in range(1,n+1):
    distance[i][i] = 0

for _ in range(r):
    start, end, cost = map(int, input().split())

    distance[start][end] = cost
    distance[end][start] = cost

for mid in range(1,n+1):
    for start in range(1,n+1):
        for end in range(1,n+1):
            if distance[start][end] > distance[start][mid] + distance[mid][end]:
                distance[start][end] = distance[start][mid] + distance[mid][end]

ans = 0

for start in range(1, n+1):
    temp = 0
    for end in range(1, n+1):
        if distance[start][end] <= m:
            temp += items[end]
    if temp > ans:
        ans = temp

print(ans)