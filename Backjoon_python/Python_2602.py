#돌다리 건너기
import sys
input = sys.stdin.readline
magic_spell = input().strip()
devil = input().strip()
angel = input().strip()
ans = 0
#dp[돌순서][마법의문자순서][다리종류(악마 0,천사 1)]
dp = [[[0] * 2 for _ in range(len(magic_spell))] for _ in range(len(devil))]
# print(dp)

for cur_stone in range(len(devil)):
    if devil[cur_stone] == magic_spell[0]:
        dp[cur_stone][0][0] = 1
    if angel[cur_stone] == magic_spell[0]:
        dp[cur_stone][0][1] = 1

for cur_stone in range(len(devil)):
    for cur_spell in range(1, len(magic_spell)):
        if devil[cur_stone] == magic_spell[cur_spell]:
            for pre_stone in range(cur_stone):
                dp[cur_stone][cur_spell][0] += dp[pre_stone][cur_spell-1][1]

        if angel[cur_stone] == magic_spell[cur_spell]:
            for pre_stone in range(cur_stone):
                dp[cur_stone][cur_spell][1] += dp[pre_stone][cur_spell-1][0]

for cur_stone in range(len(devil)):
    ans += dp[cur_stone][len(magic_spell)-1][0] + dp[cur_stone][len(magic_spell)-1][1]

print(ans)