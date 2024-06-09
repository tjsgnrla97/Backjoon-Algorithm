#좋은놈 나쁜놈
from collections import Counter

for _ in range(int(input())):
    S = input()
    cnt = 0
    for i in Counter(S):
        if i.lower() == 'g':
            cnt += Counter(S)[i]
        elif i.lower() == 'b':
            cnt -= Counter(S)[i]
    if cnt > 0:
        print(S + " is GOOD")
    elif cnt == 0:
        print(S + " is NEUTRAL")
    elif cnt < 0:
        print(S + " is A BADDY")