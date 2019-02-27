n = int(input())
p = list(map(int, input().split()))
count = 0
check = []
for i in range(n):
    if p[i] in check:
        count += 1
    else:
        check.append(p[i])
print(count)
