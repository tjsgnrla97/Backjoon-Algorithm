#탄산 음료
e,f,c = map(int, input().split())
ans = glass = 0
glass = e+f
while True:
    if glass // c > 0:
        ans += glass // c
        coke = glass // c
        glass = glass % c + coke
    else:
        break
print(ans)