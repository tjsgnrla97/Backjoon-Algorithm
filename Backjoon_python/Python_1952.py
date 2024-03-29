#달팽이2
# 직접 시뮬레이션을 돌리는 방법도 있겠지만 효율적인 방법은 아닌 것 같아 일반화된 식을 구하는 쪽으로 접근했다.

# 달팽이가 선을 꺾을 때 마다 가로, 세로 줄이 번갈아 가면서 1줄 씩 사라진다.
# 가로 혹은 세로 중 한 쪽이 완전히 사라지면 시행이 중단된다.
# 사라지는 줄의 수는 min(가로 줄 수, 세로 줄 수)*2 이며, 달팽이가 선을 꺾은 횟수는 사라진 줄 수 - 1 이다. (처음 시작할 때 1줄 먼저 지우고 시작하니까 1을 빼줘야 함)
# 만약 가로가 세로보다 길거나 같다면 1을 추가로 빼줘야 한다.
m,n=map(int,input().split())
print(2*min(m,n)-1-(m<=n))