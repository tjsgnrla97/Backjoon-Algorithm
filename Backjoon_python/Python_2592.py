#대표값

arr = [0]*1001
avg = 0
for _ in range(10):
    num = int(input())
    avg += num
    arr[num] += 1

print(avg // 10)
print(arr.index(max(arr)))



    