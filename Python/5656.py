def check(a, b, o):
    if o == ">":
        result = a > b
    elif o == ">=":
        result = a >= b
    elif o == "<":
        result = a < b
    elif o == "<=":
        result = a <= b
    elif o == "==":
        result = a == b
    else:
        result = a != b
    return result


count = 1

while True:
    a, o, b = input().split()
    if o == "E":
        break
    result = check(int(a), int(b), o)
    print("Case %d: %s" % (count, str(result).lower()))
    count += 1
