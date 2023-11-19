#나는 친구가 적다(Small)
msg = list(input())
key = input()
word = ""
for ch in msg:
    if ch.isalpha():
        word += ch
if key in word:
    print(1)
else:
    print(0)