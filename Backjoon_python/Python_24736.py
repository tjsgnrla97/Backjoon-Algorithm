#Football Scoring
ans = []
for i in range(2):
    t,f,s,p,c = list(map(int,input().split()))
    ans.append(t*6+f*3+s*2+p+c*2)
for i in ans:
    print(i,end=' ')