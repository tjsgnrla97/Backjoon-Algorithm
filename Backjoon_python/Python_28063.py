#동전 복사
N = int(input())
x,y = map(int, input().split())

if N == 1:
    print(0)
elif N == 2:
    print(2)
else:
    if (x == 1 and y == 1) or (x == 1 and y == N) or (x == N and y == 1) or (x == N and y == N):
        print(2)
    elif (x == 1 and y < N) or (x < N and y == N) or (x < N and y == 1) or (x == N and y < N):
        print(3)
    else:
        print(4)