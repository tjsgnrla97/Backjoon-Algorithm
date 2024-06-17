#이교수님의 시험
ans = [((i-1)%5)+1 for i in range(1,11)]
for i in range(1,int(input())+1):
    li = list(map(int,input().split()))
    if li == ans:
        print(i)