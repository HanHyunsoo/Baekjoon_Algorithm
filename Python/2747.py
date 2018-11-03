def f(n):
    if n == 1:
        return 1
    a = [0, 1]
    result = 0
    for i in range(n - 1):
        result = sum(a)
        a.append(result)
        del a[0]
    return result

print(f(int(input())))
