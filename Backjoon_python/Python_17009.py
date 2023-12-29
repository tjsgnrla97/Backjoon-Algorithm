#Winning Score
A = B = 0
A += 3 * int(input())
A += 2 * int(input())
A += int(input())
B += 3 * int(input())
B += 2 * int(input())
B += int(input())
if A > B:
    print("A")
elif B > A:
    print("B")
else:
    print("T")