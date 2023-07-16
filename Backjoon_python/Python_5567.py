# 결혼식

import sys
from collections import defaultdict, deque

def bfs(start):
    ans=0
    isVisited = [0 for _ in range(n+1)]
    isVisited[start] = 1
    q = deque([[start,0]])
    while q:
        u, dist = q.popleft()
        if dist <= 2:
            ans += 1
        for v in graph[u]:
            if not isVisited[v]:
                isVisited[v] = 1
                q.append([v,dist+1])
    return ans-1

n = int(sys.stdin.readline().strip())
m = int(sys.stdin.readline().strip())
graph = defaultdict(list)
for _ in range(m):
    start, end = map(int, sys.stdin.readline().split())
    graph[start].append(end)
    graph[end].append(start)

print(bfs(1))