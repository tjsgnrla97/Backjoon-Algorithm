#이진수 덧셈
for tc in range(int(input())):
    a,b = input().split(" ")
    a = int(a,2)
    b = int(b,2)
    print(bin(a+b)[2:])