#가장 긴 증가하는 부분 수열 4

import sys
input = sys.stdin.readline

n = int(input())
array = list(map(int, input().split()))

dp = [1] * n

#최장 부분 증가 수열 길이를 구하는 for문
for current in range(n):
    for before in range(current):
        if array[current] > array[before]:
            dp[current] = max(dp[current],dp[before]+1)

print(max(dp))

#수열 출력을 위한 for문
max_dp = max(dp)
lis = []
for i in range(n-1,-1,-1):
    if dp[i] == max_dp:
        lis.append(array[i])
        max_dp -= 1

lis.reverse()

for i in lis:
    print(i, end=" ")