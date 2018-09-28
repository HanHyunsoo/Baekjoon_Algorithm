for i in range(int(input())): # 테스트 데이터를 입력받고 그만큼 반복한다.
    alphabet = list(range(65, 91)) # alphabet이라는 변수에 A~Z의 아스키 코드를 리스트 형식으로 저장한다.
    result = 0 # 아스키 코드 값의 합을 저장할 변수를 result로 하고 0으로 초기화한다. 
    S = input()
    for i in alphabet: # A~Z까지 하나씩 문자열 S에 있는지 확인하고 없으면 result에 없는 아스키 코드값을 더한다.
        if S.count(chr(i)) == 0:
            result += i
    print(result) 
