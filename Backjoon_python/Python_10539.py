#수빈이와 수열
n = int(input())
B = list(map(int, input().split()))
ans = [B[0]]
for i in range(1,n):
    ans.append(B[i]*(i+1)-sum(ans))
print(*ans)