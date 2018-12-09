def cal(n):
    l = []
    for i in n:
        l.append(i - 1)
        if i % 3 == 0:
            l.append(i / 3)
        if i % 2 == 0:
            l.append(i / 2)
    return l

n = int(input())
count = 0
val_min = [n]
while True:
    if n == 1:
        print(count)
        break
    temp = val_min
    val_min = cal(temp)
    count += 1
    if min(val_min) == 1:
        print(count)
        break
