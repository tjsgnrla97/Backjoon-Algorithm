#기상청 인턴 신현수
n,k = map(int, input().split())
num_list = list(map(int, input().split()))
ans = []

for i in range(0,n-k+1):
    ans.append(sum(num_list[i:i+k]))

print(max(ans))