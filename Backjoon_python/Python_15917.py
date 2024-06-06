#노솔브 방지문제야!!
import sys
input = sys.stdin.readline

bi = [2**i for i in range(32)]
for i in range(int(input())):
    print(1 if int(input()) in bi else 0)