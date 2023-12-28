#Do Not Touch Anything
R,C,N = map(int, input().split())
x_num = y_num = 0
if R % N == 0:
    x_num = R // N
else:
    x_num = R // N + 1
if C % N == 0:
    y_num = C // N
else:
    y_num = C // N + 1
print(x_num*y_num)