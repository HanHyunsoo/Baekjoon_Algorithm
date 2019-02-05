n = int(input())
count = 0
while len(str(n)) != 1:
    result = 1
    for i in str(n):
        result *= int(i)
    n = result
    count += 1
print(count)
