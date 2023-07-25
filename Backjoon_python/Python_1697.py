#숨바꼭질
from collections import deque

n, k = map(int, input().split())
MAX = 10 ** 5
isVisited = [0] * (MAX+1)

def bfs(startX):
    q = deque()
    q.append(startX)
    while q:
        x = q.popleft()
        if x==k:
            return isVisited[x]
        for nx in (x-1, x+1, x*2):
            if 0 <= nx <= MAX and not isVisited[nx]:
                isVisited[nx] = isVisited[x]+1
                q.append(nx)
print(bfs(n))