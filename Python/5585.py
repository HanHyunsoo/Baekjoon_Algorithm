coins = (500, 100, 50, 10, 5, 1)
inputmoney = 1000 - int(input())
count = 0
for i in coins:
    count += inputmoney // i
    inputmoney %= i
print(count)