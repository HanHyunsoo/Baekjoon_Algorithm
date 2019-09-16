paper = [list('0' * 100) * (x // x) for x in range(1, 101)]
result = 0

for i in range(int(input())):
    x, y = map(int, input().split())
    for j in range(x, x + 10):
        for k in range(y, y + 10):
            if paper[k][j] == '0':
                paper[k][j] = '1'
                result += 1

print(result)
