#체육은 코딩과목 입니다
dir = ["N","E","S","W"]
ans = "N"
for _ in range(10):
    cmd = int(input())
    if cmd == 1:
        ans = dir[(dir.index(ans)+1)%4]
    elif cmd == 2:
        ans = dir[(dir.index(ans)+2)%4]
    elif cmd == 3:
        ans = dir[(dir.index(ans)+3)%4]
print(ans)