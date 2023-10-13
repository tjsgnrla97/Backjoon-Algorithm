#피로도
a,b,c,m = map(int,input().split())
time = 24
ans = 0
stress = 0

if a > m:
    print(0)
else:
    while time != 0:
        time -= 1
        if stress + a <= m:
            ans += b
            stress += a
        else:
            if stress - c >= 0:
                stress -= c
            else:
                stress = 0
    print(ans)