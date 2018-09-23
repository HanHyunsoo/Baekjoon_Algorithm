a = input()
result = 0
for i in a:
    if i == '0':
        result += 9
    result += int(i)
print(result)
