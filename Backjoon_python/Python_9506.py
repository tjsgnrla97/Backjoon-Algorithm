#약수들의 합
while True:
    num = int(input())
    if num == -1:
        break
    arr = []
    ans=0
    for i in range(1,num):
        if num % i == 0:
            arr.append(i)
    for i in arr:
        ans += i
    if num == ans:
        print(f"{num} = ",end="")
        for i in arr:
            if i==arr[len(arr)-1]:
                print(f"{i}")
            else:
                print(f"{i}",end=" + ")
    else:
        print(f"{num} is NOT perfect.")