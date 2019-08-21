def ccw(x1, x2, x3, y1, y2, y3):
    S = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1)
    if S > 0:
        return 1
    elif S < 0:
        return -1
    else:
        return 0

x_list = []
y_list = []

for i in range(3):
    x, y = map(int, input().split())
    x_list.append(x)
    y_list.append(y)

print(ccw(x_list[0], x_list[1], x_list[2], y_list[0], y_list[1], y_list[2]))
