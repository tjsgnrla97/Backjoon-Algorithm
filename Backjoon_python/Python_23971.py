#ZOAC 4
import math
h,w,n,m = map(int,input().split())
y = math.ceil(h/(n+1))
x = math.ceil(w/(m+1))
ans = y*x
print(ans)