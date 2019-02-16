result = 0
case = []
for i in range(4):
    a, b = map(int, input().split())
    result += b - a
    case.append(result)
print(max(case))
