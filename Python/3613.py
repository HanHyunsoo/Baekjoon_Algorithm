def java_to_cpp(java_string):
    result = ""
    for i in java_string:
        if ord(i) >= 65 and ord(i) <= 90:
            result += "_" + chr(ord(i) + 32)
        else:
            result += i
    return result

def cpp_to_java(cpp_string):
    result = ""
    check = False # _뒤에있는 문자를 대문자로 바꾸기위해 check(False는 _가 아직 확인안됨, True는 _가 확인되어 뒤 문자를 대문자로 바꾸기위한 것)로 확인함.
    for i in cpp_string:
        if i == "_":
            check = True
            continue

        if check == True:
            result += chr(ord(i) - 32)
            check = False
        else:
            result += i
    return result

def check_java_or_cpp(string):
    if ord(string[0]) < 95 or ord(string[0]) > 122 or ord(string[0]) == 96: # 첫글자가 소문자가 아니라면.
        return "error"

    if string[0] == "_": # 첫글자가 _로 시작한다면
        return "error"
    
    if string[-1] == "_": # 마지막글자가 _로 끝난다면
        return "error"

    if string.count("__") > 0: # 문자열중 _가 연속해서 짝수로 나온다면.
        return "error"

    if string.count("___") > 0: # 문자열중 _가 연속해서 홀수로 나온다면.
        return "error"

    check = [0, 0, 0]
    for i in string:
        if ord(i) >= 65 and ord(i) <= 90: # 대문자
            check[0] += 1
        elif ord(i) >= 97 and ord(i) <= 122: # 소문자
            check[1] += 1
        elif ord(i) == 95: # "_"
            check[2] += 1
        else: # 그외의 문자
            return "error"
    
    if check[0] == 0 and check[1] > 0 and check[2] >= 0:
        return "cpp"
    elif check[0] > 0 and check[1] > 0 and check[2] == 0:
        return "java"
    else:
        return "error"

string = input()
check = check_java_or_cpp(string)

if check == "cpp":
    print(cpp_to_java(string))
elif check == "java":
    print(java_to_cpp(string))
else:
    print("Error!")