#박스
for _ in range(int(input())):
    y,x = map(int,input().split())
    li = [[] for _ in range(x)]
    for i in range(y):
        line = list(input().split())
        for j in range(x):
            li[j].append(line[j])
    ans = 0
    for i in range(x):
        boxNum = li[i].count('1')
        floor = y-1
        for j in range(y-1,-1,-1):
            if li[i][j] == '1':
                ans += floor - j
                floor -= 1
    print(ans)