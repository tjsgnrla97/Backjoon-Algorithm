#수 이어 쓰기 1

import sys

n = sys.stdin.readline().rstrip()

leng = len(n)
ans = 0

for i in range(1,leng):
    ans += 9*10**(i-1)*i

ans += (int(n)-10**(leng-1)+1)*leng

print(ans)