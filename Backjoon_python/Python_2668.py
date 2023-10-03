#숫자고르기
import sys
sys.setrecursionlimit(100000)
input = sys.stdin.readline

n = int(input())
table = [0] #두번째 줄 숫자 담을 리스트
for _ in range(n):
    table.append(int(input()))
ans = set()

#dfs 정의
def dfs(first, second, num):
    first.add(num)  #첫번째 줄 집합에 num 추가
    second.add(table[num])  #두번째 줄 집합에 table[num] 추가
    if table[num] in first: #table[num]이 첫번째 줄 집합에 있을때
        if first == second: #첫번째 줄 집합과 두번째 줄 집합이 같다면
            ans.update(first)
            return True
        return False
    return dfs(first, second, table[num])


#dfs 실행
for i in range(1,n+1):
    if i not in ans:    #i가 결과 집합 안에 없는 경우만 실행
        dfs(set(), set(), i)

print(len(ans))
print(*sorted(list(ans)),sep="\n")