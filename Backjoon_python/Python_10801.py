#카드 게임
a = list(map(int,input().split()))
b = list(map(int,input().split()))

a_cnt, b_cnt = 0, 0
for i in range(10):
    if a[i]>b[i]:
        a_cnt += 1
    elif b[i]>a[i]:
        b_cnt += 1
if a_cnt > b_cnt:
    print("A")
elif b_cnt > a_cnt:
    print("B")
else:
    print("D")