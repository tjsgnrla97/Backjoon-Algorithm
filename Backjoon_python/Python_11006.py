#남욱이의 닭장
import sys
input = sys.stdin.readline
tc = int(input())
for t in range(tc):
    n, m = map(int, input().split())
    u = m*2-n
    t = m - u
    print(u,t)