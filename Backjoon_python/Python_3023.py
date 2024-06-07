#마술사 이민혁
import copy

r,c = map(int,input().split())
card = []
for _ in range(r):
    card.append(list(input()))

A,B = map(int,input().split())

for i in range(r):
    row = []
    for j in range(c-1,-1,-1):
        row.append(card[i][j])
    card[i].extend(row)

for i in range(r-1,-1,-1):
    row = copy.deepcopy(card[i]) #깊은 복사
    card.append(row)
#에러 처리
if card[A-1][B-1] == "#":
    card[A-1][B-1] = '.'
else:
    card[A-1][B-1] = "#"

for c in card:
    print(''.join(c))