#보너스 점수
n = int(input())
li = input()
bonus = ans = 0
for i in range(n):
    if li[i] == 'X':
        bonus = 0
    elif li[i] == 'O':
        ans += (i+1)+bonus
        bonus += 1
print(ans)