#숫자
a, b = map(int, input().split())

A = min(a,b)
B = max(a,b)
ans = B - (A+1)
if A == B or A+1==B:
    ans = 0
print(ans)
for i in range(A+1,B):
    print(i,end=" ")