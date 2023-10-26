#방 배정하기
a,b,c,n = map(int,input().split())
ok = False
for i in range(0,n+1,a):
    for j in range(0,n+1,b):
        for k in range(0,n+1,c):
            if i+j+k == n:
                ok = True
                break
if ok:
    print(1)
else:
    print(0)
