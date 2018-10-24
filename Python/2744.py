word = input()
result = ''
for i in word:
    if ord(i) < 91:
        result += chr(ord(i) + 32)
    else:
        result += chr(ord(i) - 32)
print(result)
