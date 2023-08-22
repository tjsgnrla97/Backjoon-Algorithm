#트럭 주차

a, b, c = map(int, input().split())
arr = [0] * 100
ans = 0
for _ in range(3):
    start, end = map(int, input().split())
    for i in range(start,end):
        arr[i] += 1
for trucks in arr:
    ans += {0:0, 1:a, 2:b*2, 3:c*3}[trucks]
print(ans)