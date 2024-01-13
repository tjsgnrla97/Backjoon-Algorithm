#e 계산
def factorial(n):
    if n <= 1:
        return 1
    return n * factorial(n-1)

ans = 0.0

print("n e")
print("- -----------")
for i in range(10):
    ans = 1/factorial(i) + ans
    if i==0 or i==1:
        print("%d %d"%(i,ans))
    elif i==2:
        print(i, end=" ")
        print(round(ans,9))
    else:
        print("%d %.9f"%(i,ans))
