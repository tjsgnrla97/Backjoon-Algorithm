#도미노
n = int(input())
ans = 0
for i in range(1, n+1):
    ans += 1.5 * i * (i+1)
print(int(ans))