n = int(input())
result = "*" + " *" * (n // 2 - 1) + " *" * (n % 2) + "\n" + " *" * (n // 2)
if n == 1:
    print("*")
else:
    for i in range(n):
        print(result)
