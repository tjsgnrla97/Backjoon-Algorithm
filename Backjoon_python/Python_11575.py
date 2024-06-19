#Affine Cipher
for _ in range(int(input())):
    a,b = map(int,input().split())
    msg = input()
    ans = ''.join([chr(ord('A') + ((ord(c)-ord('A'))*a + b)%26) for c in msg])
    print(ans)