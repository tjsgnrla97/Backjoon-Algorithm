next_dir = 0
next_num = 1

for i in range(int(input())):
    num = list(map(int,input().split()))
    next_num = int(next_num * num[1]/num[0])
    next_dir = (next_dir + num[2]) % 2

print(next_dir,next_num)