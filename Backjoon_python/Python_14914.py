#사과와 바나나 나눠주기
from math import gcd

a, b = map(int, input().split())
for i in range(1, gcd(a,b)+1):
    if a % i == 0 and b % i == 0:
        print(f"{i} {a // i} {b // i}")