#유진수
n= input()
ans = False
for i in range(1, len(n)):
    s1, s2 = n[:i],n[i:]
    m1 = m2 = 1
    for num in s1:
        m1 *= int(num)
    for num in s2:
        m2 *= int(num)
    if m1 == m2:
        ans = True
        break
print("YES" if ans else "NO")