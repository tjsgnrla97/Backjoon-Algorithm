#반복

muse = input().strip()

#처음 한번은 무조건 a-z가 입력되어야 한다.
ans = 1

for i in range(len(muse)-1):
    #아스키 코드를 이용해 n번 글짜와 n+1번 글자 비교
    if ord(muse[i]) >= ord(muse[i+1]):
        ans += 1

print(ans)