chess = [
    (1,0,1,0,1,0,1,0,1,0),
    (0,1,0,1,0,1,0,1,0,1),
    (1,0,1,0,1,0,1,0,1,0),
    (0,1,0,1,0,1,0,1,0,1),
    (1,0,1,0,1,0,1,0,1,0),
    (0,1,0,1,0,1,0,1,0,1),
    (1,0,1,0,1,0,1,0,1,0),
    (0,1,0,1,0,1,0,1,0,1),
    ]
# chess에서 1은 하얀색 0은 검은색
count = 0

for i in range(8):
    test_line = list(input())
    for j in range(8):
        if chess[i][j] == 1 and test_line[j] == "F":
            count += 1

print(count)
