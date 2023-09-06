#보물
import sys
input = sys.stdin.readline
n = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

ans = 0
for i in range(n):
    ans += min(A) * max(B)
    A.pop(A.index(min(A)))
    B.pop(B.index(max(B)))

print(ans)