#바닥 장식
n, m = map(int, input().split())
graph = []
for _ in range(n):
    graph.append(list(input()))

# '-' 모양 나무 판자 개수 계산
ans = 0
for i in range(n):
    a = ''
    for j in range(m):
        if graph[i][j] == '-':
            if graph[i][j] != a:
                ans += 1
        a = graph[i][j]

# '|' 모양 나무 판자 개수 계산
for j in range(m):
    a = ''
    for i in range(n):
        if graph[i][j] == '|':
            if graph[i][j] != a:
                ans += 1
        a = graph[i][j]

print(ans)