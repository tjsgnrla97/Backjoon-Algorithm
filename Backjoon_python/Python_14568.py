#2017 연세대학교 프로그래밍 경시대회
n = int(input())
ans = 0
for i in range(2, n-1, 2):
    ans += (n-i-2)//2
print(ans)