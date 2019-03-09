for i in range(int(input())):
    check_max = 0
    for j in range(int(input())):
        university, n = input().split()
        n = int(n)
        if check_max < n:
            result = university
            check_max = n
    print(result)
