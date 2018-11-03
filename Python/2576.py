result = []
for i in range(7):
    number = int(input())
    if number % 2 == 1:
        result.append(number)
if not result:
    print(-1)
else:
    print("%d\n%d" % (sum(result), min(result)))
