n = int(input())
c = list(map(int, input().split()))
count = 1
grade = 0
for i in range(n):
    if c[i] == 1:
        grade += count
        count += 1
    else:
        count = 1
print(grade)
