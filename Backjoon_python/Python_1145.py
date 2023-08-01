#적어도 대부분의 배수
num = list(map(int,input().split()))
minNum = min(num)
while True:
    cnt = 0
    for i in num:
        if minNum % i == 0:
            cnt += 1
    if cnt > 2:
        break
    minNum += 1
print(minNum)