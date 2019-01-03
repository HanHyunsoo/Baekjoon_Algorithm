import random
numbers = []
for i in range(4):
    while 1:
        randomValue = random.randint(0, 9)
        if not randomValue in numbers:
            numbers.append(randomValue)
            break
    print(randomValue, end='')
