#부재중 전화
n,l,d = map(int,input().split())
total = n*l+(n-1)*5
song = [False]*total
for i in range(0,total,l+5): #각 노래는 0초부터 시작해서 l+5초마다 나온다
    for j in range(i,i+l): # 시작하는 부분 i부터 노래가 끝나는 부분 i+l전까지 체크
        song[j] = True
for i in range(0,total,d): #0초부터 d초마다 노래가 나오는지 체크
    if not song[i]:
        print(i)
        break
else:
    print(i+d)