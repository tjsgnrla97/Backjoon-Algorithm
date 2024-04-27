#N M 찍기
n,m=map(int,input().split())
num=1
for i in range(n):
    for j in range(m):
        if num % m == 0:
            print(num, end='')
        else:
            print(num, end=' ')
        num += 1
    print()