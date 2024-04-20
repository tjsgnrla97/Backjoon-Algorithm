#고급 여관
aa, ah = map(int, input().split())
ba, bh = map(int, input().split())
while True:
    
    if bh <= 0 and ah <= 0:
        print("DRAW")
        break
    elif bh <= 0:
        print("PLAYER A")
        break
    elif ah <= 0:
        print("PLAYER B")
        break
    bh -= aa
    ah -= ba
    