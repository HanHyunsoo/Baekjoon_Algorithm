while True:
    try:
        n, m = map(int, input().split())
    except:
        break

    count = 0
    for i in range(n, m + 1):
        case = list(str(i))
        case_count = 1
        for j in case:
            if case.count(j) > 1:
                case_count = case.count(j)

        if case_count == 1:
            count += 1
    print(count)
