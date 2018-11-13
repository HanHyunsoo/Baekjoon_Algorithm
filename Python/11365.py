l = []
while 1:
    str_input = input()
    if str_input == 'END':
        break
    l.append(str_input)
for i in l:
    print(i[::-1])
