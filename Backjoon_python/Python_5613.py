#계산기 프로그램
ans = int(input())
while True:
    op = input()
    if op == "=":
        break
    num = int(input())
    if op == "+": ans += num
    elif op == "-": ans -= num
    elif op == "*": ans *= num
    elif op == "/": ans //= num
print(ans)