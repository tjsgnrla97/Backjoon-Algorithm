#알고리즘 수업 - 깊이 우선 탐색 1

import sys
sys.setrecursionlimit(10**6) #재귀 허용 깊이를 수동으로 늘려주는 코드

#정점의 수, 간선의 수, 시작 정점
n, m, r = map(int,sys.stdin.readline().split())
#연결노드 그래프 초기화(1번노드와 인덱스 값이 같게 하기 위해서 n+1)
#[[],[],[],[],[]]
graph = [[] for _ in range(n+1)]
#방문 순서 그래프 (위와 같이 인덱스 값과 노드의 값이 동일하게 만들기 위해서 n+1)
isVisited = [0]*(n+1)
#순서 입력
ans = 1

def dfs(graph,start,isVisited):
    #함수 밖의 ans 값을 사용하기 위해서 global 명시
    global ans
    #방문할 떄마다 순서 값 변경
    isVisited[start]=ans
    #연결노드 방문
    for i in graph[start]:
        #방문 안한 노드일 경우
        if not isVisited[i]:
            #순서 증가
            ans+=1
            #dfs 실행
            dfs(graph,i,isVisited)

#연결된 노드 입력 받기
for _ in range(m):
    start, end = map(int, sys.stdin.readline().split())
    graph[start].append(end)
    graph[end].append(start)

#오름차순 정리
for i in range(n+1):
    graph[i].sort()

dfs(graph,r,isVisited)

#순서 출력
for i in range(n+1):
    if i:
        print(isVisited[i])

