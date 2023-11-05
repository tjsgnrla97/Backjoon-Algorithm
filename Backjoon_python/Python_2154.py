#수 이어쓰기 3
n = int(input())
ans = ""
for i in range(1,n+1):
    ans += str(i)
print(ans.index(str(n))+1)