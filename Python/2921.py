n = int(input())
a, b, result = 3, 6, 0

for i in range(n):
    result += a
    a = a + b
    b += 3

print(result)
