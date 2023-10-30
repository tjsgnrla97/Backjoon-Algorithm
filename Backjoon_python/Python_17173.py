#배수들의 합
n, m = map(int, input().split())
k = list(map(int, input().split()))
ans = 0
for i in range(1,n+1):
    for ki in k:
        if i % ki == 0:
            ans += i
            break
print(ans)