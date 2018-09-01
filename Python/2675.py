n=int(input())
for i in range(n):
    result=""
    r,t=map(str, input().split())
    r=int(r)
    t=list(t)
    for j in t:
        result += j * r
    print(result)
