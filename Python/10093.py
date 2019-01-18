A, B = map(int, input().split())
if A > B:
    temp = A
    A = B
    B = temp
result = []
for i in range(A + 1, B):
    result.append(i)
print(len(result))
for j in result:
    if j == B - 1:
        print(j)
    else:
        print(j, end=' ')
