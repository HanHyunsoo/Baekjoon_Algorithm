m, n = map(int, input().split())
numbers = [] # 0은 소수, 1은 소수가 아님
for i in range(n + 1):
    numbers.append(0) # n 만큼 0을 추가
    
for i in range(2, n + 1):
    if numbers[i] == 0:
        for j in range(i * 2, n + 1, i): # i를 제외한 i의 배수 전부 1로 바꾸기
            numbers[j] = 1
            
numbers[0], numbers[1] = 1, 1 # 0, 1은 소수가 아니므로 1로 바꾸기

for i in range(m, n + 1):
    if numbers[i] == 0:
        print(i)
