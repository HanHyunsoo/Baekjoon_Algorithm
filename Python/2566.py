grid = []
for i in range(9):
    n = list(map(int, input().split()))
    grid.append(n)

result_max = 0
for j in range(9):
    for k in range(9):
        if grid[j][k] > result_max:
            result_max = grid[j][k]
            row = j + 1
            column = k + 1

print("%d\n%d %d" % (result_max, row, column))
