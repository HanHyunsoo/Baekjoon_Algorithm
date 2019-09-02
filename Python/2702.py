from fractions import gcd


for i in range(int(input())):
    a, b = map(int, input().split())
    print("%d %d" % (a * b // gcd(a, b), gcd(a, b)))
