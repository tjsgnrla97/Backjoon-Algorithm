#컵홀더
n = int(input())
seet = input()
count = seet.count("LL")

if(count <= 1):
    print(len(seet))
else:
    print(len(seet) - count+1)