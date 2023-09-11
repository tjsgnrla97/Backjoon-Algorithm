#친구
import sys
input = sys.stdin.readline
n = int(input())
graph = [list(input().rstrip()) for _ in range(n)]
# 2-친구 사이일 때 1, 아니면 0
# 서로 친구 = 친구 start에서 end까지 거리가 1
# 한다리 건너서 아는 친구인 경우 = 친구 start에서 친구 end까지 거리 2
floid = [[0] * n for _ in range(n)]
ans = 0
for k in range(n):
    for start in range(n):
        for end in range(n):
            #자기 자신은 친구가 아니다
            if start == end:
                continue
            #2-친구인 경우
            if graph[start][end] == "Y" or (graph[start][k] == "Y" and graph[k][end] == "Y"):
                floid[start][end] = 1
for friends in floid:
    ans = max(ans, sum(friends))
print(ans)