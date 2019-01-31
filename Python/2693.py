for i in range(int(input())):
    numbers = list(map(int, input().split()))
    numbers.sort()
    print(numbers[-3])
