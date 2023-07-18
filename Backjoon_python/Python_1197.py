# 최소 스패닝 트리

#1. Kruskal
# import sys
# input = sys.stdin.readline

# v, e = map(int, input().split())
# vRoot = [i for i in range(v+1)]
# eList = []
# for _ in range(e):
#     eList.append(list(map(int,input().split())))

# eList.sort(key=lambda x: x[2])

# def find(x):
#     if x != vRoot[x]:
#         vRoot[x] = find(vRoot[x])
#     return vRoot[x]

# ans=0

# for start, end, gain in eList:
#     startRoot = find(start)
#     endRoot = find(end)
#     if startRoot != endRoot:
#         if startRoot>endRoot:
#             vRoot[startRoot] = endRoot
#         else:
#             vRoot[endRoot] = startRoot
#         ans += gain

# print(ans)

#2. Prim
import sys
import heapq
input = sys.stdin.readline

v, e = map(int, input().split())
isVisited = [False]*(v+1)
eList = [[] for _ in range(v+1)]
heap = [[0, 1]]

for _ in range(e):
    start, end, gain = map(int, input().split())
    eList[start].append([gain,end])
    eList[end].append([gain,start])

ans = 0
cnt = 0
while heap:
    if cnt == v:
        break
    gain, start = heapq.heappop(heap)
    if not isVisited[start]:
        isVisited[start] = True
        ans += gain
        cnt += 1
        for i in eList[start]:
            heapq.heappush(heap, i)

print(ans)
