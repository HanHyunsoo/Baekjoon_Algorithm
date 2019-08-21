n = int(input())
result = 0
for i in range(1, n + 1):
    case = i
    for j in str(i):
        case += int(j)
    if case == n:
        result = i
        break
print(result)
