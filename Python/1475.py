plastic = [0,1,2,3,4,5,6,6,7,8]
count = 0
number = list(map(int, input()))
for i in range(len(number)):
    if number[i] == 9:
        number[i] = 6
while len(number) != 0:
    for i in plastic:
        if number.count(i) > 0:
            number.remove(i)
    count += 1
print(count)
