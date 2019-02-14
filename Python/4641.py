while True:
    n = list(map(int, input().split()))
    if len(n) == 1 and n.count(-1) == 1:
        break
    n.pop()
    count = 0
    for i in n:
        if n.count(i * 2) == 1:
            count += 1
    print(count)
