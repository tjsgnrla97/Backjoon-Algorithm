#Three Integers
ans = [0,0]
li = list(map(int,input().split()))
for i in li:
    if i == 1:
        ans[0] += 1
    else:
        ans[1] += 1
print(ans.index(max(ans))+1)