#팀 이름 정하기
import sys
input = sys.stdin.readline

name = input().rstrip()
n = int(input().rstrip())
arr = []
for _ in range(n):
    team_name = input().rstrip()
    s = name + team_name
    L = s.count("L")
    O = s.count("O")
    V = s.count("V")
    E = s.count("E")
    num = ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)) % 100
    arr.append((num,team_name))

arr.sort(key=lambda x : (-x[0],x[1]))
print(arr[0][1])
