l = []
for i in range(0, int(input())):
    n = int(input())
    if n == 0:
        del l[-1]
        continue
    l.append(n)
print(sum(l))
