for i in range(int(input())):
    k = int(input())
    n = int(input())
    result = []
    result.append(list(range(1, 15)))
    for j in range(k):
        floor = [1]
        for z in result[j][1:]:
            floor.append(floor[-1] + z)
        result.append(floor)
    print(result[k][n - 1])    
