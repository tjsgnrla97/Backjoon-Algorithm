#ZOAC 2
S = input().rstrip()
zoac = list(S)
current = ord('A')
ans = 0
for i in range(len(zoac)):
    ans += min(abs(ord(zoac[i])-current),26-abs(ord(zoac[i])-current))
    current = ord(zoac[i])
print(ans)