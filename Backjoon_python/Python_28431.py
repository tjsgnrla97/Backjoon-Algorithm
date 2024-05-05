#양말 짝 맞추기
li = []
for _ in range(5):
    li.append(int(input()))
for i in range(5):
    if li.count(li[i])%2==1:
        print(li[i])
        break
