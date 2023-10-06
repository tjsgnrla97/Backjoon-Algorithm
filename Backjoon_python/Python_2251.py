#물통
import sys
from collections import deque

input = sys.stdin.readline
#입력(리터 범위)
a,b,c = map(int, input().split())

#경우의 수를 담을 큐
dq = deque()
dq.append((0,0))

#방문 여부(visited[x(a)][y(b)])
visited = [[False for _ in range(b+1)] for _ in range(a+1)]
visited[0][0] = True

#답을 저장할 배열
ans = []

#x, y의 경우의 수 저장
def pour(x,y):
    if not visited[x][y]:
        visited[x][y] = True
        dq.append((x,y))

def bfs():
    while dq:
        # x : a물통 물의 양, y : b물통 물의 양, z : c 물동 물의 양
        x, y = dq.popleft()
        z = c - x - y
        
        #a 물통이 비어있는 경우 c 물통에 남아있는 양 저장
        if x == 0:
            ans.append(z)
        # x -> y
        #x 전체를 옮기거나 b물통을 꽉 채우는 방법
        water = min(x, b-y)
        pour(x - water, y + water)
        # x -> z
        water = min(x, c-z)
        pour(x - water, y)
        # y -> x
        water = min(y, a-x)
        pour(x+water, y-water)
        # y -> z
        water = min(y, c-z)
        pour(x, y-water)
        # z -> x
        water = min(z, a-x)
        pour(x+water, y)
        # z -> y
        water = min(z, b-y)
        pour(x, y+water)
bfs()

#출력
ans.sort()
print(*ans, sep=" ")