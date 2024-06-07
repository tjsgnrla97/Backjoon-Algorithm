#오르막
n = list(map(int,input().split()))
a = sorted(n)
if n == a:
    print("Good")
else:
    print("Bad")