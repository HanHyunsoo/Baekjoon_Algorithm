def change_number(n):
    result = 0
    for i in str(n):
        result += int(i)
    if len(str(result)) == 1:
        return result
    else:
        return change_number(result)

while True:
    n = int(input())
    if n == 0:
        break
    else:
        print(change_number(n))
