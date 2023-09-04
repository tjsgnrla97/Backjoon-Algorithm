#반복 수열
A, P = map(int, input().split())
dp = [A]
while True:
    tmp = 0
    for num in str(dp[-1]):
        tmp += int(num) ** P
    
    if tmp in dp:
        break

    dp.append(tmp)

print(dp.index(tmp))

# n, m = map(int, input().split())
# cur_num = n
# nums = [cur_num]

# while True:
#     temp = str(cur_num)
#     num = 0

#     for i in temp:
#         num += int(i) ** m

#     if num in nums:
#         nums = nums[:nums.index(num)]
#         break
#     else:
#         nums.append(num)
#         cur_num = num

# print(len(nums))