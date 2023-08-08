# 유레카 이론
import sys
input = sys.stdin.readline

triangle = [n*(n+1) // 2 for n in range(1,46)] # 45번째 삼각수 == 1035
eurreka = [0] * 1001

for i in triangle:
    for j in triangle:
        for k in triangle:
            num = i+j+k
            if num <= 1000:
                eurreka[num] = 1

tc = int(input())
for _ in range(tc):
    print(eurreka[int(input())])