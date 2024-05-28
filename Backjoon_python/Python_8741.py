#이진수 합
k = int(input())
t = 2**k - 1
ans = t*(t+1)//2
print(bin(ans)[2:])