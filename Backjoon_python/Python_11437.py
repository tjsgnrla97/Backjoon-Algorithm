#LCA
import sys
sys.setrecursionlimit(100001)
input = sys.stdin.readline

n = int(input())
parent = [0] * (n+1) # 각 노드의 부모 노드 정보
distant = [0] * (n+1) # 각 노드까지의 깊이
visited = [0] * (n+1) # 방문 여부
tree = [[] for _ in range(n+1)]

for _ in range(n-1):
    start, end = map(int, input().split())
    tree[start].append(end)
    tree[end].append(start)

#루트 노드부터의 깊이 구하기
def dfs(parent_node, depth):
    visited[parent_node] = True
    distant[parent_node] = depth

    for node in tree[parent_node]:
        if visited[node]:
            continue
        parent[node] = parent_node
        dfs(node, depth+1)

#최소 공통 조상 찾기
def lca(a,b):
    #깊이 맞추기
    while distant[a] != distant[b]:
        if distant[a] > distant[b]:
            a = parent[a]
        else:
            b = parent[b]
    #노드 맞추기
    while a != b:
        a = parent[a]
        b = parent[b]

    return a


dfs(1,0)

m = int(input())

for _ in range(m):
    a, b = map(int, input().split())
    print(lca(a,b))