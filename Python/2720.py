money = [25, 10, 5, 1]
for i in range(int(input())):
    c = int(input())
    result = []
    for j in money:
        result.append(c // j)
        c %= j
    for p in result:
        print(p, end=' ')
