T = int(input())
for i in range(T):
    result = []
    data = list(map(int, input().split()))
    for j in range(len(data)):
        if data[j] % 2 == 0:
            result.append(data[j])
    print(sum(result), min(result))
