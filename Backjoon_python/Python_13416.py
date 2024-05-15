#주식 투자
import sys
input = sys.stdin.readline

for _ in range(int(input())):
    ans = 0
    for _ in range(int(input())):
        li = list(map(int,input().split()))
        if max(li) >= 0:
            ans += max(li)
    print(ans)