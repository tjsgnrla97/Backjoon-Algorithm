#요세푸스 문제 0
from collections import deque
n, k = map(int, input().split())

dq = deque([i for i in range(1, n+1)])

ans = []
while len(dq) != 0:
    for _ in range(k-1):
        dq.append(dq.popleft())
    ans.append(str(dq.popleft()))

print("<"+", ".join(ans)+">")