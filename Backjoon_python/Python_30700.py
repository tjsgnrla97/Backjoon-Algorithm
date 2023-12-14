#KOREA 문자열 만들기
S = input()
ans = 0
li = ['K','O','R','E','A']
korea = 0

for current in S:
    if current == li[korea]:
        korea += 1
        ans += 1
    if korea == 5:
        korea = 0
print(ans)