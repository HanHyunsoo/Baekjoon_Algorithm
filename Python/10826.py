def f(n):
    if n == 1:
        return 1
    numbers = [0, 1]
    result = 0
    
    for i in range(n - 1):
        result = sum(numbers)
        del numbers[0]
        numbers.append(result)
        
    return result

print(f(int(input())))
    
