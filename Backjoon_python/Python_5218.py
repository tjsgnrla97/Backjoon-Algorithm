#알파벳 거리
import sys
input = sys.stdin.readline
t = int(input())
for tc in range(t):
    x, y = input().split()
    ans = []
    for i in range(len(x)):
        if ord(y[i])>=ord(x[i]):
           ans.append(ord(y[i])-ord(x[i]))
        else:
            ans.append((ord(y[i])+26)-ord(x[i])) 
    print("Distances: ",end="")
    print(*ans)
