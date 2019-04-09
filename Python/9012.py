def checkBracket(string):
    count = 0 # count 변수를 만들어 이 변수로 문자열을 체크한다.
    for i in string:
        if i == "(": # 문자가 (면 count에 1을 더한다.
            count += 1
        else: # 문자가 )면 count에 1을 빼는데 여기서 count가 음수면 VPS가 아니므로 False반환
            count -= 1
            if count < 0:
                return False
    if count == 0: # 문자가 0이면 (와 )의 개수가 딱 맞으므로 True반환
        return True
    else: # 위에서 음수는 조건으로 판별 했으므로 0보다 크면 문자가 남아서 False반환
        return False

for i in range(int(input())):
    inputString = input()
    if checkBracket(inputString):
        print("YES")
    else:
        print("NO")
