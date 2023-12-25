#아이들은 사탕을 좋아해
T = int(input())
for _ in range(T):
    N,K = map(int,input().split())
    ans = 0
    candies = list(map(int, input().split()))
    for c in candies:
        if c // K != 0:
            ans += c // K
    print(ans)