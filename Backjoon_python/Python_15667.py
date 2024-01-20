#2018 연세대학교 프로그래밍 경진대회
K = int(input())
for i in range(1,K+1):
    if 1 + i + i**2 == K:
        print(i)
        break