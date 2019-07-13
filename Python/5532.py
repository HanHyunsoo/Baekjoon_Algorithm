input_list = []
for i in range(5):
    input_list.append(int(input()))

while True:
    if (input_list[1] <= 0) and (input_list[2] <= 0):
        break
    else:
        input_list[1] -= input_list[3]
        input_list[2] -= input_list[4]
        input_list[0] -= 1

print(input_list[0])