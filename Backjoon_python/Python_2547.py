#사탕 선생
T = int(input())
for _ in range(T):
    q = input()
    n = int(input())
    li = [int(input()) for i in range(n)]
    print("YES" if sum(li)%n==0 else "NO")