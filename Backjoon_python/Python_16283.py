#farm
a,b,n,w = map(int, input().split())
arr = []
for i in range(1,n):
    if(a*i+b*(n-i)==w):
        arr.append([i,n-i])
print(-1 if len(arr) != 1 else f"{arr[0][0]} {arr[0][1]}")