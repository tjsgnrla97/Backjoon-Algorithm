#숨바꼭질 3
import sys
from collections import deque

MAX = 100001
isVisited = [False] * MAX
time = [-1] * MAX

input = sys.stdin.readline

n, k = map(int,input().split())
q = deque()
q.append(n)
isVisited[n] = True
time[n]=0

while q:
    now = q.popleft()
    if now == k:
        print(time[k])
        break
    if now-1>=0 and isVisited[now-1]==False: #x-1
        q.append(now-1)
        isVisited[now-1]=True
        time[now-1]=time[now]+1
    if now * 2 < MAX and isVisited[now*2]==False: #순간이동
        q.appendleft(now*2) #순간이동은 0초이므로 최우선순위
        isVisited[now*2] = True
        time[now*2]=time[now] #순간이동은 시간변동 x
    if now+1 < MAX and isVisited[now+1]==False: # x+1 이동
        q.append(now+1)
        isVisited[now+1]=True
        time[now+1] = time[now]+1
