while 1:
    a, b = map(int, input().split())
    if a == 0 and b == 0:
        break
    if a - b < b:
        b = a - b
    result = 1
    for i in range(1, b+1):
        result = result * a / i
        a -= 1
    print(int(result))
