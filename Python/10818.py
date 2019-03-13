def arr_min(arr):
    result = arr[0]
    for i in arr[1:]:
        if i < result:
            result = i
    return result

def arr_max(arr):
    result = arr[0]
    for i in arr[1:]:
        if i > result:
            result = i
    return result

n = int(input())
arr = list(map(int, input().split()))
print("%d %d" % (arr_min(arr), arr_max(arr)))
