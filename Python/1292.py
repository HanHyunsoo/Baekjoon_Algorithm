a, b = map(int, input().split())
p = []
count = 1

while len(p) <= b:
    for i in range(count):
        p.append(count)
    count += 1

result = 0
for j in p[a-1:b]:
    result += j
print(result)
