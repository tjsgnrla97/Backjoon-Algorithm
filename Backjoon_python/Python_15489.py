#파스칼 삼각형
R,C,W = map(int, input().split())
ans=0
dp = [[1]*i for i in range(1,32)]

for y in range(2,31):
    for x in range(1,len(dp[y])-1):
        dp[y][x] = dp[y-1][x-1]+dp[y-1][x]

for y in range(R-1,R+W-1):
    for x in range(C-1,C+(y-R)+1):
        ans += dp[y][x]

print(ans)