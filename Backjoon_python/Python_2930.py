#가위 바위 보
r = int(input())
msg = input()
n = int(input())
f_msg = [input() for _ in range(n)]

rsp = {'R':0,'S':1,'P':2}

score = max_score = 0
for i in range(r):
    temp_score = [[0,'R'],[0,'S'],[0,'P']]
    for j in range(n):
        if (rsp[msg[i]]+1) % 3 == rsp[f_msg[j][i]]:
            score += 2
        elif msg[i] == f_msg[j][i]:
            score += 1

        for t in temp_score:
            if (rsp[t[1]]+1) % 3 == rsp[f_msg[j][i]]:
                t[0] += 2
            elif t[1] == f_msg[j][i]:
                t[0] += 1
    max_score += max(temp_score)[0]
print(score)
print(max_score)