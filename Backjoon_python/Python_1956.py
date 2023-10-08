#운동
import sys
input = sys.stdin.readline

v, e = map(int, input().split())
#시작->도착의 거리비용 저장
graph = [[int(1e9) for _ in range(v+1)] for _ in range(v+1)]

ans = int(1e9)

for _ in range(e):
    start, end, cost = map(int, input().split())
    graph[start][end] = cost
#경유지 k, 출발지, 도착지 3중 for문 플로이드 워셜
for k in range(1,v+1):
    for start in range(1,v+1):
        for end in range(1,v+1):
            #start->end가 start->경유지->end보다 빠른지 검사
            if graph[start][k] + graph[k][end] < graph[start][end]:
                graph[start][end] = graph[start][k] + graph[k][end]

for i in range(1,v+1):
    #사이클은 출발지와 도착지가 같은 경우이므로 i->i를 확인
    ans = min(ans, graph[i][i])

#최솟값이 없으면 -1, 있으면 최솟값 출력
if ans == int(1e9):
    print(-1)
else:
    print(ans)


# import heapq as hq

# V, E = map(int, input().split())
# graph = [[] for _ in range(V+1)]
# #거리를 저장할 배열을 2차원으로
# dist = [[1e9] * (V+1) for _ in range(V+1)]

# heap = []
# for _ in range(E):
#     x, y, c = map(int, input().split())
#     graph[x].append([c, y])
#     dist[x][y] = c
#     #heap에도 비용, 출발지, 도착지 3개의 값을 넣어준다.
#     #유효한 경로 값을 다 넣어줌
#     hq.heappush(heap, [c, x, y])


# while heap:
#     #최소 비용의 경로를 먼저 뽑아주고 (d:비용, s:출발, g:도착)
#     d, s, g = hq.heappop(heap)
#     #출발지와 도착지가 같다면 사이클!
#     #heap을 이용하기 때문에 처음 나온 사이클이 가장 비용이 작은 사이클이므로 break 해버려도 됨! -> 여기서 시간이 굉장히 절약되는 듯 
#     if s == g:
#         print(d)
#         break
#     #d 값이 이미 저장된 비용보다 크다면 넘겨버림
#     if dist[s][g] < d:
#         continue
        
#     #g에서 갈 수 있는 노드들을 검사
#     for nd, ng in graph[g]:
#     	# s->g->ng로 가는 비용
#         new_d = d + nd
#         # s->g->ng로 가는게 s->ng보다 빠르다면 값 갱신해주고 heap에 넣어줌
#         if new_d < dist[s][ng]:
#             dist[s][ng] = new_d
#             hq.heappush(heap, [new_d, s, ng])
# else:
#     #heap 다 돌았는데 없다면 -1
#     print(-1)