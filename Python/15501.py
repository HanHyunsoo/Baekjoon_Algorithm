n = int(input())

t1 = input().split()
t2 = input().split()

l1, l2 = len(t1), len(t2)
start = 0

for x in range(l1):
    if t2[0] == t1[x]:
        start = x

check1, check2 = True, True

y = start
for x in range(l1):
    if t2[x] != t1[y]:
        check1 = False
        break
    else:
        y += 1

        if y >= n:
            y = 0

y = start
for x in range(l1):
    if t2[x] != t1[y]:
        check2 = False
        break
    else:
        y -= 1

        if y < 0:
            y = n-1

if check1 == True or check2 == True:
    print("good puzzle")
else:
    print("bad puzzle")
