#슈퍼 마리오
num=[]
for _ in range(10):
    num.append(int(input()))
result=0
for i in num:
    result += i
    if result >= 100:
        if result - 100 > 100 - (result-i):
            result -= i
        break
print(result)
