#애너그램
import sys
input = sys.stdin.readline

t = int(input())

for tc in range(t):
    a, b = map(str, input().split())

    x = sorted(list(a))
    y = sorted(list(b))

    if x==y:
        print(f"{a} & {b} are anagrams.")
    else:
        print(f"{a} & {b} are NOT anagrams.")