#상자넣기
n = int(input())
box = list(map(int, input().split()))
dp = [1 for _ in range(n)]
for next in range(1, n):
    for current in range(next):
        if box[current] < box[next]:
            dp[next] = max(dp[next],dp[current]+1)
print(max(dp))