#비밀편지
n = int(input())
msg = input()
msg_li = []
for i in range(0,n*6,6):
    msg_li.append(msg[i:i+6])
pwd = ['000000', '001111', '010011', '011100', '100110', '101001', '110101', '111010']
correct = ''
incorrect = 0
for i in msg_li:
    incorrect = 0
    for j in pwd:
        cnt = 0
        for k in range(6):
            if i[k] == j[k]:
                cnt += 1
        if cnt >= 5:
            correct += chr(pwd.index(j)+65)
            break
        else:
            incorrect += 1
    if incorrect == len(pwd):
        print(msg_li.index(i)+1)
        quit()
print(correct)