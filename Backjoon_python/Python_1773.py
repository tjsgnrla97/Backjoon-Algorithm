#폭죽쇼
n,c = map(int, input().split())
li = [0]*(c+1)
ans = 0
for i in range(n):
    cnt = int(input())
    for j in range(cnt, c+1, cnt):
        if li[j]==0:
            li[j]=1
            ans+=1
print(ans)