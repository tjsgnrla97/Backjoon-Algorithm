#Pyramids
while True:
    n = int(input())
    ans = 0
    if n == 0:
        break
    ans = int((1+n)*(n/2))
    print(ans)