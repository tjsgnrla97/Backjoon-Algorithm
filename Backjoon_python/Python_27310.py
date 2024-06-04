#chino_shock
msg = input()
n = len(msg) + 2
cnt = 0
for s in msg:
    if s == "_":
        cnt += 1
print(n+cnt*5)