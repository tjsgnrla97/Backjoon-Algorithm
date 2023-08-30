#2차원 배열의 합
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

k = int(input())
dp = [[0]*(m+1) for _ in range(n+1)]

for y in range(1, n+1):
    for x in range(1, m+1):
        dp[y][x] = arr[y-1][x-1] + dp[y-1][x] + dp[y][x-1] - dp[y-1][x-1]

for _ in range(k):
    i, j, y, x = map(int, input().split())
    print(dp[y][x]-dp[y][j-1]-dp[i-1][x]+dp[i-1][j-1])
