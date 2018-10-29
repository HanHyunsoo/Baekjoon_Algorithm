n = int(input())
numbers = list(map(int ,input().split()))
count = 0
for i in range(n):
    test = []
    for j in range(1, numbers[i] + 1):
        if numbers[i] % j == 0:
            test.append(j)
    if len(test) == 2:
        count += 1
print(count)
