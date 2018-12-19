import random
lotto = []
for i in range(6):
    while 1:
        randomValue = random.randint(1, 46)
        if not randomValue in lotto:
            lotto.append(randomValue)
            break
    print(randomValue, end=' ')
