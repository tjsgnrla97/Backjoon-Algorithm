#2진수 뒤집기
n = int(input())
bn = bin(n)
bn = bn[2:]
bn_reverse = bn[::-1]
ans = int(bn_reverse,2)
print(ans)