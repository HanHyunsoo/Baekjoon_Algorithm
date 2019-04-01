def wineCount(c, k, p):
    result = 0
    for i in range(1, c + 1):
        result += k * i + p * i * i
    return result

c, k, p = map(int, input().split())
print(wineCount(c, k, p))