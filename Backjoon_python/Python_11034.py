#캥거루 세마리2
while True:
    try:
        a,b,c = map(int, input().split())
        ans = max(b-a,c-b) - 1
        print(ans)
    except:
        break