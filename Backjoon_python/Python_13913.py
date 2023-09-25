#숨바꼭질 4
from collections import deque

n, k = map(int, input().split())
# dist 배열 👉 dist[현재노드] = 걸리는 시간(초)
# move 배열 👉 move[현재노드] = 이전 노드 (=부모노드)
dist = [0] * 100001
move = [0] * 100001

def path(x):
    arr = []
    temp = x
    for _ in range(dist[x]+1):
        arr.append(temp)
        temp = move[temp]
    print(' '.join(map(str, arr[::-1])))

def bfs():
    dq = deque()
    dq.append(n)
    while dq:
        x = dq.popleft()
        if x == k:
            print(dist[x])
            path(x)
            return x
        for dx in (x+1, x-1, 2*x):
            if 0 <= dx <= 100000 and dist[dx]==0:
                dq.append(dx)
                dist[dx] = dist[x] + 1
                move[dx] = x
bfs()