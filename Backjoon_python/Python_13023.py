#ABCDE
import sys
input = sys.stdin.readline

N, M = map(int, input().split())
friend_list = [[] for _ in range(N)]
isVisited = [False] * (N+1)
ans = False

for _ in range(M):
    start, end = map(int, input().split())
    friend_list[start].append(end)
    friend_list[end].append(start)

def dfs(idx, depth):
    global ans
    isVisited[idx] = True
    if depth == 4:
        ans = True
        return
    for friend in friend_list[idx]:
        if not isVisited[friend]:
            isVisited[friend] = True
            dfs(friend, depth+1)
            isVisited[friend] = False

for i in range(N):
    dfs(i,0)
    isVisited[i] = False
    if ans:
        break
print(1 if ans else 0)