#요다
for _ in range(int(input())):
    li = list(input().split())
    for i in range(2, len(li)):
        print(li[i],end=' ')
    print(li[0],li[1])