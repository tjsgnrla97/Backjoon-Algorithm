n = int(input())
chickens = list(map(int,input().split()))
ans = 0
for chicken in chickens:
    if chicken <= n:
        ans += chicken
    else:
        ans += n
print(ans)