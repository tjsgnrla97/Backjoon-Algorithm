#지우개
n = int(input())
arr = [i+1 for i in range(n)]
temp = []
while len(arr) != 1:
    for idx, item in enumerate(arr):
        if idx % 2:
            temp.append(item)
    arr = temp
    temp = []
print(arr[0])