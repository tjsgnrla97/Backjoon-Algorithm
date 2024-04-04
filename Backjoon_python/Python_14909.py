#양수 개수 세기
li = list(map(int,input().split()))
ans = 0
for i in li:
    if i > 0:
        ans += 1
print(ans)