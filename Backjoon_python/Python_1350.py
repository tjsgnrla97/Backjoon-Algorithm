#진짜공간
n = int(input())
files = list(map(int, input().split()))
cluster = int(input())
num = 0
for i in range(n):
    if files[i] != 0 and files[i] <= cluster:
        num += 1
    elif files[i] == 0:
        continue
    else:
        if files[i]%cluster != 0:
            num += (files[i]//cluster)+1
        else:
            num += (files[i]//cluster)
print(cluster*num)