def change_max(n):
    result = ""
    for i in str(n):
        if i == "5":
            result += "6"
        else:
            result += i
    return int(result)

def change_min(n):
    result = ""
    for i in str(n):
        if i == "6":
            result += "5"
        else:
            result += i
    return int(result)

a, b = map(int, input().split())
max_a, max_b = change_max(a), change_max(b)
min_a, min_b = change_min(a), change_min(b)

print("%d %d" % (min_a + min_b, max_a + max_b))
