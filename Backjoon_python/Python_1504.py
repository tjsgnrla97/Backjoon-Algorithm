#특정한 최단 경로
import sys
import heapq
input = sys.stdin.readline

INF = int(1e9)

N, E = map(int, input().split())
graph = [[] for _ in range(N+1)]

#무방향 그래프, a => b, b => a 모두 추가
for _ in range(E):
    startV, endV, cost = map(int, input().split())
    graph[startV].append((endV, cost))
    graph[endV].append((startV,cost))

v1, v2 = map(int, input().split())

def dijkstra(start):
    distance = [INF] * (N+1)
    distance[start] = 0

    hq = []
    heapq.heappush(hq, (0,start))

    while hq:
        dist, now = heapq.heappop(hq)

        for end_cost in graph[now]:
            cost = dist + end_cost[1]

            if distance[end_cost[0]] > cost:
                distance[end_cost[0]] = cost
                heapq.heappush(hq, (cost, end_cost[0]))
    #반환값은 최단 거리 배열
    return distance

#출발점이 각각 1번정점, v1, v2일 때의 최단 거리 배열
from_1 = dijkstra(1)
from_v1 = dijkstra(v1)
from_v2 = dijkstra(v2)

v1_path = from_1[v1] + from_v1[v2] + from_v2[N]
v2_path = from_1[v2] + from_v2[v1] + from_v1[N]

ans = min(v1_path, v2_path)
print(ans if ans < INF else -1)