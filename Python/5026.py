for i in range(int(input())):
    result = input()
    if result == "P=NP":
        print("skipped")
    else:
        result = result.split("+")
        print(int(result[0]) + int(result[1]))
