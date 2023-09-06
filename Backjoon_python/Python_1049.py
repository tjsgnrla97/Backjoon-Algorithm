#기타줄
import sys
input = sys.stdin.readline

N, M = map(int, input().split())

guitar = [list(map(int, input().split())) for _ in range(M)]
answer = 0

six_guitar = sorted(guitar, key=lambda x : x[0])
one_guitar = sorted(guitar, key=lambda x : x[1])

if six_guitar[0][0] <= one_guitar[0][1] * 6:
    answer = six_guitar[0][0] * (N//6) + one_guitar[0][1] * (N % 6)
    if six_guitar[0][0] < one_guitar[0][1] * (N % 6):
        answer = six_guitar[0][0] * (N//6 + 1)
else:
    answer = one_guitar[0][1] * N

print(answer)