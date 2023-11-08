#그림 비교
n = int(input())
paint = []
for i in range(n):
    paint.append(list([input().rstrip() for _ in range(5)]))

ans = []
for first in range(n-1):
    for second in range(first+1, n):
        temp = 0
        for y in range(5):
            for x in range(7):
                if paint[first][y][x] != paint[second][y][x]:
                    temp += 1
        ans.append((temp, first+1, second+1))

final_ans = min(ans)
print(final_ans[1], final_ans[2])