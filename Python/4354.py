while 1:
    s = input()
    if(s == '.'):
        break
    n = len(s)
    m = n

    for i in range(n):
        if(n % (i+1) != 0):
            continue
        else:
            if(s[:i+1]*(n//(i+1)) == s):
                m = n//(i+1)
                break

    print(m)
