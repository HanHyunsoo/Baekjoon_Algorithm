n = int(input())
q = int(pow(n, 0.5))
if q*q < n:
    print(q+1)
else:
    print(q)
