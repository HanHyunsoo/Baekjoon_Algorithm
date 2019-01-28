triangle = []
for i in range(3):
    triangle.append(int(input()))

if sum(triangle) == 180:
    same_count = 0
    for j in triangle:
        same_count = triangle.count(j)
        if same_count == 3:
            print("Equilateral")
            break
        elif same_count == 2:
            print("Isosceles")
            break
        else:
            continue
    if same_count == 1:
        print("Scalene")
else:
    print("Error")
