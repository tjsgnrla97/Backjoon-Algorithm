#母音を数える (Counting Vowels)
n = int(input())
msg = input()
ans = 0

for i in msg:
    if i in ['a','e','i','o','u']:
        ans += 1
print(ans)