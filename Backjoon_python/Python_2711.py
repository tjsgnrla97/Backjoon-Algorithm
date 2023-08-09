# 오타맨 고창영
import sys
input = sys.stdin.readline

tc = int(input())
for _ in range(tc):
    idx, msg = input().split()
    idx = int(idx)
    print(msg[:idx-1]+msg[idx:])