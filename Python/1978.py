n = int(input())
numbers = list(map(int ,input().split()))
count = 0
for i in range(n):
    case = []
    for j in range(1, numbers[i] + 1):
        if numbers[i] % j == 0:
            case.append(j)
    if len(case) == 2:
        count += 1
print(count)
