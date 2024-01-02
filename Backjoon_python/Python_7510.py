#고급 수학
for tc in range(int(input())):
    tri = sorted(map(int, input().split()))
    if tri[0]**2 + tri[1]**2 == tri[2]**2:
        print(f"Scenario #{tc+1}:")
        print("yes\n")
    else:
        print(f"Scenario #{tc+1}:")
        print("no\n")