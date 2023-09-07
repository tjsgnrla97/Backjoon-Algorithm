#터렛
import sys
import math
input = sys.stdin.readline
T = int(input())
for tc in range(T):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())
    distance = math.sqrt((x1-x2)**2 + (y1-y2)**2) # 두 원의 거리 (원의 방정식)
    if distance == 0 and r1 == r2: # 두 원이 동심원이고 반지름이 같다
        print(-1)
    elif abs(r1-r2) == distance or r1 + r2 == distance: #내접, 외접일 때
        print(1)
    elif abs(r1 - r2) < distance < (r1 + r2): # 두 원이 서로다른 두 점에서 만날 때
        print(2)
    else:
        print(0) #그 외에

# 원의 방정식을 이용한 두 좌표 사이의 거리 구하기
# (x - a)^2 + (y - b)^2 = r^2
# sqrt((x2-x1)^2 + (y2-y1)^2)

# 중심거리와 두 원의 위치 관계
# r1 + r2 < d 이면 두 원은 서로의 외부에 위치한다.
# r1 + r2 = d 이면 두 원은 외접한다.
# |r1 - r2| < d < r1 + r2 이면 두 원은 서로 다른 두 점에서 만난다.
# |r1 - r2| = d 이면 한 원이 다른 원에 내접한다.
# |r1 - r2| > d, r1 ≠ r2 이면 한 원이 다른 원의 내부에 있다.