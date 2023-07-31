#Hashing
l = int(input())
m = 1234567891
r = 31
msg = input()
ans=0

for i in range(len(msg)):
    num = ord(msg[i])-96
    ans += num * (r**i)
print(ans%m)