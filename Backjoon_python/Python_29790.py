#임스의 메이플컵
n,u,l = map(int,input().split())
flag = 0
if n>=1000:
    flag = 1
else:
    print('Bad')
if flag == 1 and (u >= 8000 or l >= 260):
    flag += 1
if flag == 1:
    print('Good')
elif flag == 2:
    print('Very Good')