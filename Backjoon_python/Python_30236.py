#증가 수열
T = int(input())
for _ in range(T):
    n = int(input())
    b = [i for i in range(1,n+1)]
    a = list(map(int, input().split()))

    for i in range(len(b)):
        if b[i] == a[i]:
            b[i] += 1
        for j in range(i+1, len(b)):
            if b[j-1] >= b[j]:
                b[j] += (b[j-1] - b[j])+1

    print(b[-1])