n = int(input())
result = 0
i = 1
while i <= n:
    result += n - i + 1
    i *= 10
print(result)
