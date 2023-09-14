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

# from collections import deque


# f, s, g, u, d = map(int, input().split())


# def bfs(start, goal):
#     q = deque()
#     visited = [-1] * (f + 1)

#     q.append(start)
#     visited[start] = 0

#     while q:
#         x = q.popleft()

#         if x == goal:
#             return visited[x]

#         for nx in (x + u, x - d):
#             if 0 < nx <= f and visited[nx] == -1:
#                 q.append(nx)
#                 visited[nx] = visited[x] + 1

#     return "use the stairs"


# print(bfs(s, g))