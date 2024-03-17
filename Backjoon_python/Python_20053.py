#최소, 최대 2
for _ in range(int(input())):
    n = int(input())
    num = list(map(int,input().split()))
    print(f"{min(num)} {max(num)}")