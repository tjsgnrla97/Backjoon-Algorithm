#최소비용
import sys
#우선순위 큐 구현을 위함
import heapq

input = sys.stdin.readline

# 입력
n = int(input()) #정점 개수
m = int(input()) #간선 개수
graph = [[] for _ in range(n+1)]
for _ in range(m):
    parent, child, gain = map(int, input().split())
    graph[parent].append((child,gain)) #도착지, 가중치

start, end = map(int, input().split()) #출발지, 목적지

# 다익스트라 최적경로 탐색
def dijkstra(graph, start):
    distances = [int(1e9)]*(n+1) #처음 초기값은 무한대
    distances[start] = 0 #시작 노드까지의 거리는 0
    q = []
    heapq.heappush(q, [distances[start],start]) #시작노드부터 탐색 시작
    
    while q:
        dist, node = heapq.heappop(q) #탐색할 노드거리, 노드

        #기존 최단거리보다 멀다면 무시
        if distances[node] < dist:
            continue

        #노드와 연결된 인접노드 탐색
        for child, gain in graph[node]:
            distance = dist + gain #인접노드까지의 거리
            if distance < distances[child]: #기존 거리보다 짧으면 갱신
                distances[child] = distance
                heapq.heappush(q,[distance,child]) #다음 인접 거리를 계산하기 위해 큐에 삽입
    
    return distances

dist_start = dijkstra(graph,start)
print(dist_start[end])