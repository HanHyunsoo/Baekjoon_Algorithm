n = int(input())
a = n - 1
for i in range(1, n + 1):
    print(' ' * (a) + '*' * (2*i-1))
    a -= 1
a = 1
for i in range(n - 1, 0, -1):
    print(' ' * (a) + '*' * (2*i-1))
    a += 1
