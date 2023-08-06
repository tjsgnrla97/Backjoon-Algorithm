#캠핑
import sys
input = sys.stdin.readline
tc = 1
while True:
    l,p,v = map(int,input().split())
    if l==0 and p==0 and v==0:
        break
    ans=0
    temp = v // p
    ans = l * temp
    ans += min(v % p,l)
    print(f"Case {tc}: {ans}")
    tc += 1
