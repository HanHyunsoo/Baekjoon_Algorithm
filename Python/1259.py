while 1:
    test = input()
    
    if test == "0":
        break

    if test == test[::-1]:
        print("yes")
    else:
        print("no")
