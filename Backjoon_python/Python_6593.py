#상범 빌딩
import sys
from collections import deque
input = sys.stdin.readline

dy = [1,-1,0,0,0,0]
dx = [0,0,1,-1,0,0]
dz = [0,0,0,0,1,-1]

#반복문을 통한 각 테스트케이스 실행
while True:
    l, r, c = map(int, input().split())
    #l r c 모두 0 일시 반복 중지
    if l == 0 and r == 0 and c == 0:
        break
    board = [[] * r for _ in range(l)]
    visited = [[[0 for _ in range(c)] for _ in range(r)] for _ in range(l)]
    
    #보드 입력
    for z in range(l):
        for _ in range(r):
            board[z].append(list(map(str, input().strip())))
        input()

    #반복문을 통해 S와 E의 좌표 확인
    for z in range(l):
        for y in range(r):
            for x in range(c):
                if board[z][y][x] == "S":
                    sz, sy, sx = z, y, x
                elif board[z][y][x] == "E":
                    ez, ey, ex = z, y, x

    def bfs():
        dq = deque([[sz,sy,sx]])
        
        while dq:
            z, y, x = dq.popleft()

            #도착지점이라면 출력값 리턴
            if z == ez and y == ey and x == ex:
                return f"Escaped in {visited[z][y][x]} minute(s)."
            
            #반복문을 통한 육방탐색
            for d in range(6):
                nz = z + dz[d]
                ny = y + dy[d]
                nx = x + dx[d]

                #경계체크 및 방문체크
                if 0 <= nz < l and 0 <= ny < r and 0 <= nx < c and visited[nz][ny][nx] == 0:
                    #탐색장소 금이 아니라면 방문
                    if board[nz][ny][nx] == "." or board[nz][ny][nx] == "E":
                        visited[nz][ny][nx] = visited[z][y][x] + 1
                        dq.append([nz,ny,nx])

        #도착지점에 도착하지 못했다면 Trapped! 리턴
        return "Trapped!"

    print(bfs())

    