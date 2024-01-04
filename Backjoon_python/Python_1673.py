#치킨 쿠폰
try:
    while True:
        n,k=map(int, input().split())
        ans = n + (n//k)
        while n>=k:
            n = (n//k)+(n%k)
            ans += n//k
        print(ans)
except:
    exit()