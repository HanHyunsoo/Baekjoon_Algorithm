string = input()
result = ''

for i in string:
    if ord(i) <= 67:
        result += chr(ord(i) + 23)
    else:
        result += chr(ord(i) - 3)

print(result)
