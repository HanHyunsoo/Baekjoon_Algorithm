from math import sqrt # math 모듈에 sqrt함수(제곱근함수)를 불러온다.

def checkInt(n):
    """
    n이 sqrt로 구한 값이면 반환값이 float형이기때문에 뒤에 소수점이 무조건 붙는다.
    그런데 딱 나누어 떨어지게 된다면 뒤에있는 소수가 0밖에없기 때문에 n을 문자열로 바꾼다음
    뒤에 '.0'이면 int형으로 간주하여 True를 반환하고 아니면 False를 반환한다.
    """
    if str(n)[-2:] == ".0":
        return True
    else:
        return False

m = int(input())
n = int(input())
result = []
# m ~ n 만큼 각각에 해당하는 i를 checkInt함수로 판별하여 True면 result에 i값을 추가
for i in range(m, n + 1):
    if checkInt(sqrt(i)):
        result.append(i)

# result의 길이가 0이면 m ~ n 사이에 만족하는 값이 없으므로 -1을 출력
if len(result) == 0:
    print(-1)
# 그외에는 값이 있으므로 result의 전체 합과 최솟값을 출력
else:
    print("%d\n%d" % (sum(result), min(result)))