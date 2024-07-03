#알파벳 전부 쓰기
n = int(input())
for i in range(n):
    msg = input().lower()
    ans = ""
    for ascii in range(ord('a'),ord('z')+1):
        if msg.find(chr(ascii))==-1:
            ans += chr(ascii)
    if ans == "":
        print("pangram")
    else:
        print(f"missing {ans}")