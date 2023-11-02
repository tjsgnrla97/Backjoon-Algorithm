#타임머신
tm = list(map(int, input().split(":")))
hour = [h for h in range(1,13)]
min_sec = [ms for ms in range(60)]

ans = 0

for h in range(3):
    for m in range(3):
        for s in range(3):
            if h != m and m != s and s != h:
                if tm[h] in hour and tm[m] in min_sec and tm[s] in min_sec:
                    ans += 1

print(ans)