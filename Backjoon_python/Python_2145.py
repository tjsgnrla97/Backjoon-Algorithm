#숫자 놀이
while True:
    n = int(input())
    if n==0:
        break
    while(n>9):
        n = sum(map(int,list(str(n))))
    print(n)