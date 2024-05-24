#헤일스톤 수열
from sys import stdin
for _ in range(int(stdin.readline())):
    n = int(stdin.readline())
    li = [n]
    while n != 1:
        if n % 2 == 0:
            n //= 2
        else:
            n = n*3 + 1
        li.append(n)
    print(max(li))