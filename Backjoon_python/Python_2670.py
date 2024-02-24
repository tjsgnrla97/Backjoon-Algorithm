#연속부분최대곱
n = int(input())
dp = list(float(input()) for _ in range(n))
for i in range(1,n):
    dp[i] = max(dp[i], dp[i] * dp[i-1])
print(f"{max(dp):.3f}")