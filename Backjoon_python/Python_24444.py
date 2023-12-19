#알고리즘 수업 - 너비 우선 탐색 1
from collections import deque
import sys
input = sys.stdin.readline

n,m,r = map(int, input().split())
graph = [[] for _ in range(n+1)]
visited = [0] * (n+1)
count = 1

for _ in range(m):
    start, end = map(int, input().split())
    graph[start].append(end)
    graph[end].append(start)

def bfs(v):
    global count

    dq = deque([r])
    visited[r] = 1
    while dq:
        v = dq.popleft()
        graph[v].sort()
        for g in graph[v]:
            if visited[g] == 0:
                count += 1
                visited[g] = count
                dq.append(g)

bfs(r)

for v in visited[1:]:
    print(v)