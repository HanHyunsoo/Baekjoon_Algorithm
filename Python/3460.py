def binary(n):
    result = ""
    while n > 1:
        result += str(n % 2)
        n //= 2
    result += str(n)
    result = result[::-1]
    return result

for i in range(int(input())):
    n = binary(int(input()))[::-1]
    for i in range(len(n)):
        if n[i] == "1":
            print(i, end=' ')
    print("")
