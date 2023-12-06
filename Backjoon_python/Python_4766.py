#일반 화학 실험
n = float(input())
while True:
    next = float(input())
    if next == 999:
        break
    print("%.2f" % (next-n))
    n = next
