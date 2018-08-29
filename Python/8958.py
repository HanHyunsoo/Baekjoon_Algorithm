n=int(input())
for i in range(n):
    result=0
    plus=1
    s=list(str(input()))
    for j in s:
        if j == 'O':
            result += plus
            plus += 1
        else:
            plus = 1
            continue
    print(result)
