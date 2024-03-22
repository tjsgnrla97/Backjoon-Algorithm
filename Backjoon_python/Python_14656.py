#조교는 새디스트야!!
n = int(input())
student = list(map(int,input().split()))

ans = 0
for i in range(1,n+1):
    if student[i-1] != i:
        ans += 1
print(ans)