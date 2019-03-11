def bin_to_oct(n):
    n = n[::-1]
    result = 0
    for i in range(len(n)):
        if n[i] == "1":
            result += 2**i

    return result

def oct_to_bin(n):
    result = ""
    if n == 0:
        result = "0"
    else:
        while n >= 1:
            result += str(n % 2)
            n //= 2
    result = result[::-1]

    return result

def bin_sum(a, b):
    a = bin_to_oct(a)
    b = bin_to_oct(b)

    return oct_to_bin(a + b)

a, b = input().split()
print(bin_sum(a, b))