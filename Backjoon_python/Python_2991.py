#사나운 개
A,B,C,D = map(int,input().split())
delivery = list(map(int,input().split()))

for end in delivery:
    ans = 0
    if 0 < end % (A+B) <= A:
        ans += 1
    if 0 < end % (C+D) <= C:
        ans += 1
    print(ans)
