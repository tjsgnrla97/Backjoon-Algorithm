#스타트링크
from collections import deque
def bfs(start,end):
    global ans
    dq = deque([(start,0)])
    isGoal = False
    isVisited = [0 for _ in range(F+1)]
    while dq:
        current_stair, cnt = dq.popleft()
        if current_stair == end:
            ans = min(ans,cnt)
            isGoal = True
        if current_stair + U <= F and not isVisited[current_stair+U]:
            dq.append((current_stair+U,cnt+1))
            isVisited[current_stair+U]=1
        if current_stair - D >= 1 and not isVisited[current_stair-D]:
            dq.append((current_stair-D,cnt+1))
            isVisited[current_stair-D]=1
    if isGoal: 
        return ans
    else:
        return "use the stairs"
ans = int(1e9)
F,S,G,U,D = map(int, input().split())
print(bfs(S,G))