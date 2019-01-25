word = input()
result = []
for i in range(len(word)):
    result.append(word[i:])
result.sort()
for j in result:
    print(j)
