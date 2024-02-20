#Bunnies
for _ in range(int(input())):
    n = int(input())
    ans = [0 for _ in range(n+2)]
    ans[0] = 1
    ans[1] = 1
    if len(ans) >= 3:
        for i in range(2,len(ans)):
            ans[i] = ans[i-1]+ans[i-2]
    print(ans[n])