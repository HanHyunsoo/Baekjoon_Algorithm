l = []
i = 666
n = int(input())
while len(l) < n:
    if '666' in str(i): l.append(i)
    i += 1
print(l[n - 1])
