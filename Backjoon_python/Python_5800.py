#성적 통계
import sys
input = sys.stdin.readline

K = int(input())
for tc in range(1,K+1):
    ClassK = list(map(int, input().split()))
    del ClassK[0]
    ClassK.sort(reverse=True)
    diff = []
    for i in range(len(ClassK)-1):
        diff.append(ClassK[i]-ClassK[i+1])
    print("Class", tc)
    print(f"Max {max(ClassK)}, Min {min(ClassK)}, Largest gap {max(diff)}")
