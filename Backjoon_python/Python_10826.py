#피보나치 수 4
n = int(input())
dp = []
dp.append(0)
dp.append(1)
dp.append(1)
for i in range(3,n+1):
    dp.append(dp[i-1]+dp[i-2])

print(dp[n])
