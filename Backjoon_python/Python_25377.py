#빵
ans = 1001
for _ in range(int(input())):
    a,b = map(int, input().split())
    if a <= b:
        ans = min(ans,b)
print([ans,-1][ans==1001])