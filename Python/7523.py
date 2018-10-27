for i in range(int(input())):
    a, b = map(int, input().split())
    if a >= 0:
        result =  b*(b+1)//2 - a*(a-1)//2
    elif a < 0 and b >= 0:
        result = b*(b+1)//2 + a*(abs(a)+1)//2
    else:
        result =  a*(abs(a)+1)//2 - b*(abs(b)-1)//2
    print("Scenario #%d: \n%d\n" % (i+1, result))
