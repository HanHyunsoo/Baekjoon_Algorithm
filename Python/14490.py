from math import gcd
s = input()
s = list(map(int, s.split(':')))
g = gcd(s[0], s[1])
print("%d:%d" % (s[0] // g, s[1] // g))
