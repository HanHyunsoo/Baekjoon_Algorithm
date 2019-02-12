while True:
    r = list(input().split())
    if r[0] == "#" and int(r[1]) == 0 and int(r[2]) == 0:
        break
    else:
        if int(r[1]) > 17 or int(r[2]) >= 80:
            print("%s Senior" % r[0])
        else:
            print("%s Junior" % r[0]) 
