#병사 배치하기
n = int(input())
army = list(map(int, input().split()))
dp = [1] * n
#앞에 있는 병사가 항상 뒤의 병사보다 커야함
#남아있는 병사 수가 최대가 되어야 함

for next in range(n):
    for pre in range(next):
        if army[next] < army[pre]:
            dp[next] = max(dp[next],dp[pre]+1)

print(len(army) - max(dp))