#카이사르 암호
alpha = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"]
msg = input()
ans=""
for m in msg:
    for i in range(26):
        cnt=0
        if alpha[i]==m:
            cnt=i-3
            if cnt<0:
                cnt += 26
            ans += alpha[cnt]
print(ans)

"""
li = list(input())
for i in range(len(li)):
    k = ord(li[i]) - 3
    if k < ord('A'):
        k += 26
    li[i] = chr(k)
print(''.join(li))
"""