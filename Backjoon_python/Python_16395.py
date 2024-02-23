#파스칼의 삼각형
n,k = map(int, input().split())
paskal = [[1 for _ in range(n+1)] for _ in range(n+1)]
# [1][1] = 1
# [2][1] = 1 [2][2] = 1
# [3][1] = 1 [3][2] = 2 [3][3] = 1
# i 3~n j 2~i-1
# paskal[i][j] = paskal[i-1][j-1] + paskal[i-1][j]
for i in range(3,n+1):
    for j in range(2,i):
        paskal[i][j] = paskal[i-1][j-1] + paskal[i-1][j]
print(paskal[n][k])