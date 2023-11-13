#소수 단어
import math

#입력
word = input()

#합 구하기
ans = 0
for ch in word:
    if ch.islower():
        ans += ord(ch) - 96 # a : 97
    else:
        ans += ord(ch) - 38 # A : 65

#소수 판별
is_prime = True
for i in range(2, int(math.sqrt(ans))+1):
    if ans % i == 0:
        is_prime = False

if is_prime:
    print("It is a prime word.")
else:
    print("It is not a prime word.")