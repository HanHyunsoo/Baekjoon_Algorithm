number=input()
if len(number) == 1: # 만약 숫자가 10보다 작으면 앞에 0을 붙임
    number = '0' + number
original_number=number # 처음 입력했던 숫자
number=list(map(int,number)) # 사이클의 길이를 구하기 위해 정수형으로 바꿈
result = 0 # 사이클의 길이 초기화
while True:
    number.reverse() # 리스트를 역순으로 배열해서 뒤의 숫자를 앞으로 오게함
    number[1] += number[0] # 뒤의 숫자를 앞의 숫자와 더한 값은 두번째 숫자 자리(인덱스 1번)에 저장
    if number[1] >= 10: # 앞, 뒤 숫자를 더한 값이 10을 넘으면 그 뒤의 값으로 저장함 예) 4+8=12 따라서 2를 가져옴
        number[1] %= 10
    result += 1 # 사이클의 길이를 더함
    if ''.join(map(str,number)) == original_number: # 새로운 수와 원래 수를 문자열로 비교해서 맞으면 While문을 벗어
        break
print(result)
