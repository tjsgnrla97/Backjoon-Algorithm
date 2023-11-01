#신기한 수
n = int(input())
ans = 0
for i in range(1, n+1):
    temp = sum([int(ch) for ch in str(i)])
    if i % temp == 0:
        ans += 1
print(ans)