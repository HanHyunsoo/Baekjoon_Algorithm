from fractions import gcd


def lcm(a, b):
    return a * b / gcd(a, b)


a, b = map(int, input().split())
print("{}\n{}".format(int(gcd(a, b)), int(lcm(a, b))))
