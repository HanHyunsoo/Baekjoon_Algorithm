n = int(input())
plus = 6
result = 1
count = 1
while result < n:
    result += plus
    plus += 6
    count += 1
print(count)
