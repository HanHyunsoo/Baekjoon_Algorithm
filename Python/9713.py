result = 0
for i in range(int(input())):
    result = 0
    for j in range(1, int(input()) + 1):
        if j % 2 == 1:
            result += j
    print(result)