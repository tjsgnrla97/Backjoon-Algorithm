#창영마을
cup = [1,0,0]
cmd = input()
for current in cmd:
    if current == "A":
        cup[0], cup[1] = cup[1], cup[0]
    elif current == "B":
        cup[1], cup[2] = cup[2], cup[1]
    else:
        cup[0], cup[2] = cup[2], cup[0]
print(cup.index(1)+1)