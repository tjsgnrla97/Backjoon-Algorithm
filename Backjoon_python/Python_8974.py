#희주의 수학시험
a,b = map(int,input().split())
li = []
for i in range(1,b+1):
    if len(li) < b:
        for _ in range(i):
            li.append(i)
print(sum(li[a-1:b]))
