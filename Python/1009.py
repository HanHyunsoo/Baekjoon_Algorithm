def checkComputer(a, b):
    """
    반복문으로 a의 제곱 순열(1~ 똑같은 숫자가 있을때까지) 구하는 함수.
    int(caseNum[-1])은 해당하는 숫자의 첫째자리이다.
    첫째자리가 numArr에 또 있으면 그 순열은 반복하는 것이므로
    리스트에 추가하지 말고 반복을 멈춘다.
    result는 b에 순열의 길이(0부터 시작하므로 1을 뺀다.)를 나눈 나머지값.
    result가 0이면 나누어 떨어지는 것이므로 10으로 반환.
    """
    numArr = []
    i = 1
    while True:
        caseNum = str(a ** i)
        if numArr.count(int(caseNum[-1])) > 0:
            break
        else:
            numArr.append(int(caseNum[-1]))
            i += 1

    result = numArr[b % len(numArr) - 1]
    if result == 0:
        return 10
    else:
        return result

for i in range(int(input())):
    a, b = map(int, input().split())
    print(checkComputer(a, b))