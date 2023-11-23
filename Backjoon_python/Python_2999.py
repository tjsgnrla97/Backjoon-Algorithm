#비밀 이메일
msg = input()
leng = len(msg)

x,y = 0,0

for i in range(1, int(leng/2)+1):
    for j in range(i,leng+1):
        if i*j == leng:
            x,y = i,j

for i in range(x):
    for j in range(y):
        print(msg[i+j*x],end="")