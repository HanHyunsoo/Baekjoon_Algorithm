# alphabet이라는 사전을 만들고 key를 알파벳의 아스키 코드값 value를 알파벳에 따른 시간초로 한다.
alphabet = {}
count = 0
number = 3
for i in range(65, 91): # A ~ Z 까지
    if i == 83 or i == 90: # S와 Z는 예외적으로 3의 배수가 아니므로 시간초 - 1을 한다.
        alphabet[i] = number - 1
        continue
    alphabet[i] = number
    count += 1
    if count == 3: # 시간초마다 알파벳의 개수가 3의 배수이므로 count가 3이면 0으로 초기화하고 number를 1 증가시킨다.
        count = 0
        number += 1

name = list(input()) # 단어를 입력받고 리스트로 만든다.
result = 0

for i in range(len(name)): # 단어의 인덱스 0부터 끝까지
    result += alphabet[ord(name[i])] # 각각의 인덱스의 아스키 코드값을 구해서 alphabet에서 value값을 구하고 result에 더한다.
print(result)
