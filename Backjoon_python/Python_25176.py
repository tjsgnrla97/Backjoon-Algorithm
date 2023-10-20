#청정수열
from itertools import permutations
n = int(input())
arr = [i for i in range(n)]

ans = 0
for i in permutations(arr,n):
    ans += 1
print(ans)

# n=int(input())
# a=1
# for i in range(1,n+1):
#   a *= i
# print(a)