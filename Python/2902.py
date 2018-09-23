name = input()
result = ''
for i in name:
    if ord(i) < 91 and ord(i) > 64:
        result += i
print(result)
