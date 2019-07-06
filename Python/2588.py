a = int(input())
b = int(input())

for i in range(3):
    print(a * int((str(b)[::-1])[i]))

print(a * b)