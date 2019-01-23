string = input()
result = ""
for i in string:
    if ord(i) >= 65 and ord(i) <= 90:
        ASCII = ord(i) + 13
        if ASCII > 90:
            ASCII -= 26
    elif ord(i) >= 97 and ord(i) <= 122:
        ASCII = ord(i) + 13
        if ASCII > 122:
            ASCII -= 26
    else:
        ASCII = ord(i)

    result += chr(ASCII)
print(result)
