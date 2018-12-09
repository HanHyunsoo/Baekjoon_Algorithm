N = int(input())
s = 4**N
for i in range(s + 1):
    if i ** 2 == s:
        point = (i + 1)**2
        break
print(point)
