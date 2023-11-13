#점프 점프
x,y,a,b = map(int, input().split())
rx, ry = [a], [b]
ans = -1
for i in range(1000):
    rx.append(rx[i]+x)
    ry.append(ry[i]+y)
    if rx[i] + x in ry or ry[i] + y in rx:
        ans = min(rx[i]+x,ry[i]+y)
        break
print(ans)