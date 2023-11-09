#완전수
T = int(input())
num = list(map(int, input().split()))
for tc in range(T):
    n = num[tc]
    temp = 0
    for i in range(1, n//2+1):
        if n % i == 0:
            temp += i
    if n == temp:
        print("Perfect")
    elif n < temp:
        print("Abundant")
    else:
        print("Deficient")