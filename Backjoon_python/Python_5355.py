#화성 수학
import sys
input = sys.stdin.readline

t = int(input())
for _ in range(t):
    result = list(input().split())
    ans = float(result[0])
    for cal in result:
        if cal == "@":
            ans *= 3
        elif cal == "%":
            ans += 5
        elif cal == "#":
            ans -= 7
    print("%0.2f"%ans)
