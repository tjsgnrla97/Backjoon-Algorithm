#팰린드롬
for _ in range(int(input())):
    msg = input().lower()
    print("Yes" if msg == msg[::-1] else "No")