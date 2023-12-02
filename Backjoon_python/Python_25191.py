#치킨댄스를 추는 곰곰이를 본 임스
n = int(input())
a,b = map(int,input().split())
ans = a//2 + b
if n >= ans:
    print(ans)
else:
    print(n)