n = int(input())
for i in range(1, n + 1):
    if i > 1:
        print(" " * (n - i) + "*" + " " * (1 + 2 * (i - 2)) + "*")
    else:
        print(" " * (n - 1) + "*")
