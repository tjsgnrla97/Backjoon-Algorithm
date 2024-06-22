#대충 더해
a,b=input().split()
la,lb = len(a),len(b)
if la > lb:
    b = '0'*(la-lb)+b
else:
    a = '0'*(lb-la)+a
ans = ""
for i in range(len(a)):
    ans += str(int(a[i])+int(b[i]))
print(ans)