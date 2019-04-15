while True:
    inputString = input()
    if inputString == "EOI":
        break
    checkNemo = False

    for i in range(len(inputString) - 3):
        case = ""
        for j in range(4):
            case += inputString[i + j].lower()
            
        if case == "nemo":
            checkNemo = True
            break
    
    if checkNemo:
        print("Found")
    else:
        print("Missing")
