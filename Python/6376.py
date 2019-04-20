def factorial(n):
    if n <= 1:
        return 1

    return n * factorial(n - 1)

def e(n):
    result = 0
    for i in range(n + 1):
        result += 1 / factorial(i)
    return result

print("n e\n- -----------")
for i in range(0, 10):
    if i < 3:
        if i == 2:
            print("%d %.1f" % (i, e(i)))
        else:
            print("%d %d" % (i, e(i)))
    else:
        print("%d %.9f" % (i, e(i)))