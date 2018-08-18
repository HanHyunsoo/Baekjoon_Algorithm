def d(n): # n과 n의 각 자리수를 더하는 함수
    result=n
    n=str(n)
    for i in range(len(n)):
        result += int(n[i])
    return result

function=[d(i) for i in range(10001)] # 0부터 10000까지 d(n)을 각각 구하고 function 리스트에 저장
self_number=[]
for i in range(10001): # function 리스트에 0~10000에서 없는 숫자들은 생성자가 없으므로 그 숫자들을 찾아서 self_number 리스트에 저장
    if function.count(i) == 0:
        self_number.append(i)
for i in self_number:
    print(i)
