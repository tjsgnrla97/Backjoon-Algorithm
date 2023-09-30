#도시 분할 계획
import sys
input = sys.stdin.readline
n,m = map(int,input().split()) #집의 개수, 길의 개수
tree = []
for _ in range(m): #길 입력
    a,b,c = map(int, input().split())
    tree.append([c,a,b])
tree.sort() #비용 기준 오름차순 정렬

parent = [0] * (n+1) #부모 노드 초기화
for i in range(1,n+1):
    parent[i] = i

def find(x):
    if parent[x] != x:
        parent[x] = find(parent[x])
    return parent[x]

def union(a,b):
    a = find(a)
    b = find(b)
    if a < b:
        parent[b] = a
    else:
        parent[a] = b

#크루스칼 알고리즘 수행
selected = []

ans = 0
for c, a, b in tree:
    if find(a) != find(b):
        union(a,b)
        ans += c
        selected.append(c)

#마을을 두개로 분리하기 위해 마지막(최대비용) 길 제거
ans -= selected.pop()

print(ans)