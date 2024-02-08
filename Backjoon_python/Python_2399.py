#거리의 합
import sys
 
n = int(sys.stdin.readline().rstrip())
ar = sys.stdin.readline().rstrip().split(' ')
prefixsum = []
 
for i in range(n):
    ar[i] = int(ar[i])
    prefixsum.append(0)
 
ar.sort()
 
for i in range(1, n):
    prefixsum[i] = prefixsum[i - 1] + (ar[i] - ar[i - 1]) * i
 
res = 0
for i in prefixsum:
    res += i
 
print(res * 2)