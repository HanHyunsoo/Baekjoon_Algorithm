def decimal_to_binary(n):
    result = ''
    while (n >= 1):
        result += str(n % 2)
        n //= 2
    return result[::-1]

def binary_to_decimal(n):
    result = 0
    multiple = 1
    for i in n[::-1]:
        if i == '1':
            result += multiple
        multiple *= 2
    return result

n = binary_to_decimal(input())
print(decimal_to_binary(n*17))
