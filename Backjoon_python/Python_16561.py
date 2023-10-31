#3의 배수
n = int(input())

ans = 1
cnt = 2

for i in range(9,n,3):
    ans += cnt
    cnt += 1
print(ans)