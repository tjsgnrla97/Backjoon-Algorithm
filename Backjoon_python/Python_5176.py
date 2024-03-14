#대회 자리
for _ in range(int(input())):
    p,m = map(int,input().split())
    table = [0 for _ in range(m+1)]
    ans = 0
    for _ in range(p):
        human = int(input())
        if table[human] == 0:
            table[human] =1
        else:
            ans += 1
    print(ans)