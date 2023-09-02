#⚾
import sys
from itertools import permutations

input = sys.stdin.readline

n = int(input())
inning = [list(map(int, input().split())) for _ in range(n)]
ans = 0

def solve(line_up):
    now = 0
    score = 0
    for e in inning:
        out = 0
        b1, b2, b3 = 0, 0, 0
        while out<3:
            if e[line_up[now]] == 0:
                out += 1
            elif e[line_up[now]] == 1:
                score += b3
                b1, b2, b3 = 1, b1, b2
            elif e[line_up[now]] == 2:
                score += (b2+b3)
                b1, b2, b3 = 0, 1, b1
            elif e[line_up[now]] == 3:
                score += (b1+b2+b3)
                b1, b2, b3 = 0, 0, 1
            else:
                score += (b1+b2+b3+1)
                b1, b2, b3 = 0, 0, 0
            now = (now+1)%9
    return score

for line_up in permutations(range(1,9),8):
    line_up = list(line_up[:3])+[0]+list(line_up[3:])
    ans = max(ans, solve(line_up))
print(ans)
