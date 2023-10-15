#당신은 운명을 믿나요?
S = str(input())
Str = list(S)

k = ['K','O','R','E','A']
y = ['Y','O','N','S','E','I']

for current in Str:
    if current == k[0]:
        k.remove(current)
        if len(k) == 0:
            print("KOREA")
            break
    if current == y[0]:
        y.remove(current)
        if len(y) == 0:
            print("YONSEI")
            break