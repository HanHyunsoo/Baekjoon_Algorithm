def operation(a, operator, b):
    a = int(a)
    b = int(b)
    if operator == "+":
        return a + b
    elif operator == "-":
        return a - b
    elif operator == "*":
        return a * b
    else:
        if a < 0 or b < 0:
            return -(abs(a) // abs(b))
        else:
            return a // b

inputString = input().split()
k = [inputString[0], inputString[2], inputString[4]]
o = [inputString[1], inputString[3]]
result = [operation(operation(k[0], o[0], k[1]), o[1], k[2]),
          operation(k[0], o[0], operation(k[1], o[1], k[2]))]
print("%d\n%d" % (min(result), max(result)))