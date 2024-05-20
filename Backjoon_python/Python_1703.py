#생장점
while True:
    li = list(map(int,input().split()))
    if li[0] == 0:
        break
    ans = 1
    for i in range(li[0]):
        sf = li[2*i+1]
        p = li[2*i+2]
        ans = ans * sf - p
    print(ans)