lines=int(input())
for i in range(lines):
    number=list(map(int, input().split()))
    students=number[0]
    del number[0]
    average=0
    for i in range(students):
        average += number[i]
    over_average=0
    for i in range(students):
        if number[i] > (average/students):
            over_average += 1
    print("%0.3f%%" % (over_average/students*100))
