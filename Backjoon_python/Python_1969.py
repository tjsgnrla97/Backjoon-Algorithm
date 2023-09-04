#DNA
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
dna_list = [input() for _ in range(n)]
ans_dna = "" 
ans_hd = 0

for x in range(m):
    A, C, G, T = 0, 0, 0, 0
    for y in range(n):
        if dna_list[y][x] == "T":
            T += 1
        elif dna_list[y][x] == "A":
            A += 1
        elif dna_list[y][x] == "G":
            G += 1
        elif dna_list[y][x] == "C":
            C += 1
    if max(A,C,G,T) == A:
        ans_dna += "A"
        ans_hd += C + G + T
    elif max(A,C,G,T) == C:
        ans_dna += "C"
        ans_hd += A + G + T
    elif max(A,C,G,T) == G:
        ans_dna += "G"
        ans_hd += A + C + T
    elif max(A,C,G,T) == T:
        ans_dna += "T"
        ans_hd += A + C + G
print(ans_dna)
print(ans_hd)
