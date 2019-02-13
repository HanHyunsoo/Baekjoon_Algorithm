while True:
    q = input()
    if q == "#":
        break
    result = 0
    for i in range(len(q)):
        if q[i] == " ":
            continue
        else:
            result += (i + 1) * (ord(q[i]) - 64)
    print(result)
