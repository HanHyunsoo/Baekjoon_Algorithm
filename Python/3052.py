result = []
for i in range(10):
    n = int(input())
    n %= 42
    if n not in result:
        result.append(n)

print(len(result))
