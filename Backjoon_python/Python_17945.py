#통학의 신
a, b = map(int, input().split())
arr = []
for x in range(-1000, 1001):
    if x * (2*a-x) == b:
        arr = list(set([-x,-(2*a-x)]))
print(*sorted(arr))