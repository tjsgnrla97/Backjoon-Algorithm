#맥주 냉장고
n = int(input())
min = 2**31-1
ans = ""

for i in range(1,n+1):
    if i*i*i>n:
        break
    if n%i==0:
        sub = n // i
        
        for j in range(i, sub+1):
            if j * j > sub:
                break
            if sub % j == 0:
                k = sub // j
                area = i*j+i*k+j*k
                if area<min:
                    ans = f"{k} {j} {i}"
print(ans)