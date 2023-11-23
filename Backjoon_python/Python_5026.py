#박사 과정
T = int(input())

for _ in range(T):
    msg = input()
    if msg == "P=NP":
        print("skipped")
    else:
        a, b = map(int, msg.split("+"))
        print(a+b)