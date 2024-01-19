#삼각수의 합
for tc in range(int(input())):
    n = int(input())
    ans = sum(k*sum(range(k+2)) for k in range(1,n+1))
    print(ans)