while True:
    triangle = list(map(int, input().split()))
    triangle.sort()
    
    if sum(triangle) == 0:
        break
    
    if triangle[2]**2 == triangle[0]**2 + triangle[1]**2:
        print("right")
    else:
        print("wrong")