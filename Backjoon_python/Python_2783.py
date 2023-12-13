#삼각김밥
seven_x, seven_y = map(int,input().split())
ans = [seven_x/seven_y]
N = int(input())
for _ in range(N):
    x, y = map(int,input().split())
    ans.append(x/y)
print("%.2f"%(min(ans)*1000))