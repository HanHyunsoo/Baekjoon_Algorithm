numbers = []
for i in range(9):
    numbers.append(int(input()))
print("%d\n%d" % (max(numbers), numbers.index(max(numbers))+1))
