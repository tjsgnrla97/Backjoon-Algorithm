#줄 세우기
#전형적인 위상정렬 문제
#A가 B보다 반드시 먼저 앞에 와야하는 상황
#A->B를 만족시키면서 정렬을 해야하기 때문
#위상 정렬 과정은 다음과 같다.
# 1. 진입차수가 0인 정점을 큐에 삽입
# 2. 큐에서 원소를 꺼내 해당 원소와 연결된 간선을 모두 제거
# 3. 제거한 후 진입차수가 0인 정점을 큐에 삽입
# 4. 이후 2-3의 과정 반복
import sys
from collections import deque
input = sys.stdin.readline
n,m = map(int, input().split())

tree = [[] for _ in range(n+1)]
in_degree = [0 for _ in range(n+1)]
dq = deque()
ans = []

for i in range(m):
    a, b = map(int, input().split())
    tree[a].append(b)
    in_degree[b] += 1
for i in range(1, n+1):
    if in_degree[i] == 0:
        dq.append(i)

while dq:
    current_student = dq.popleft()
    ans.append(current_student)
    for next_student in tree[current_student]:
        in_degree[next_student] -= 1
        if in_degree[next_student] == 0:
            dq.append(next_student)

print(*ans)