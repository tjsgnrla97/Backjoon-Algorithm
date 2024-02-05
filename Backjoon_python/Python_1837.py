#암호제작
p,k = map(int, input().split())

#k까지 나눠지는 수가 있는지 확인
for i in range(2,k):
    if p % i == 0:
        print("BAD", i)
        break
else:
    print("GOOD")