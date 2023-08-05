#N번째 큰 수
import sys
input = sys.stdin.readline
t = int(input())
for _ in range(t):
    a = list(map(int,input().split()))
    a.sort()
    print(a[7])