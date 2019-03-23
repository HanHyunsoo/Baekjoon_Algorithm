n = int(input())
a, b, digit = 0, 9, 1

while True:
    if a < n and n <= b:
        index = n - a - 1
        break
    digit += 1
    a = b
    b = a + int("9" + "0" * (digit - 1)) * digit

result = str(10**(digit-1) + (index//digit))
print(result[index % digit])