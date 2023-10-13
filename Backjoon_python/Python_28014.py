#첨탑 밀어서 부수기
n = int(input())
tower = list(map(int, input().split()))
ans=1
cnt=0
for i in range(n-1):
    if tower[cnt] <= tower[i+1]:
        cnt=i+1
        ans+=1
    else:
        cnt+=1
print(ans)