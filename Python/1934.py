from fractions import gcd


def lcm(a, b):
    return int(a * b / gcd(a , b))


for i in range(int(input())):
    a, b = map(int, input().split())
    print(lcm(a, b))
