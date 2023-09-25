#이모티콘
from collections import deque
n = int(input())
time = [[-1] * (n+1) for _ in range(n+1)]
dq = deque()
dq.append((1,0))
time[1][0] = 0
while dq:
    screen, clip = dq.popleft()
    if time[screen][screen] == -1:
        time[screen][screen] = time[screen][clip] + 1
        dq.append((screen,screen))
    if screen+clip <= n and time[screen+clip][clip] == -1:
        time[screen+clip][clip] = time[screen][clip] + 1
        dq.append((screen+clip,clip))
    if screen - 1 >= 0 and time[screen-1][clip] == -1:
        time[screen-1][clip] = time[screen][clip] + 1
        dq.append((screen-1,clip))
ans = -1
for i in range(n+1):
    if time[n][i] != -1:
        if ans == -1 or ans > time[n][i]:
            ans = time[n][i]
print(ans)