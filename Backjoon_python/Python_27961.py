#고양이는 많을수록 좋다
n= int(input())
cat = 0
k=0
ans=0
while True:
    if cat == n:
        print(ans)
        break
    else:
        if cat==0:
            cat += 1
            k+=1
        elif cat+k <= n:
            cat += k
            k += k
        elif cat+k > n:
            cat = n
            k = n
    ans += 1