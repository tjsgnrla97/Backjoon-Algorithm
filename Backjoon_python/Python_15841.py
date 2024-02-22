#Virus Outbreak
arr = [0 for _ in range(491)]
arr[1] = 1
for i in range(2,491):
    arr[i] = arr[i-1]+arr[i-2]
while True:
    s = int(input())
    if s == -1:
        break
    print(f"Hour {s}: {arr[s]} cow(s) affected")