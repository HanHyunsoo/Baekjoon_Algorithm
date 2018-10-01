n = int(input())
star = 1
for i in range(n):
    print(' ' * i + '*' * (2*n-star))
    star += 2
