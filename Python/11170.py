for i in range(int(input())):
    N, M = map(int, input().split())
    count = 0
    for j in range(N, M + 1):
        if str(j).count("0") > 0:
            count += str(j).count("0")
    print(count)
