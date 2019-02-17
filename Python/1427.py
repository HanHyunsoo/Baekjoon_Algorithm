n = input()
result = []
for i in n:
    result.append(int(i))
result.sort()
result.reverse()
for j in result:
    print(j, end='')
