word = input()
word = list(word.upper()) # word라는 변수에 문자열을 입력받고 전부 대문자로 변환후 리스트로 바꾼다.
w = [] # w라는 빈 리스트를 생성
for i in range(65,91): # word 리스트에 A~Z(아스키코드 활용)까지 개수를 각각 센다.
    w.append(word.count(chr(i)))
for i in range(len(word)+1): # word 리스트에 가장 많이 사용된 알파벳의 최댓값은 word의 길이. 따라서 0~len(word)까지 반복문을 돌려 제일 많은 대문자를 구함
    if w.count(i) == 0: # count가 0이면 countinue
        continue
    max = w.count(i) # 최댓값의 개수를 구하고 max에 저장
    a = chr(w.index(i) + 65) # 최댓값의 index번호 + 65로 대문자를 a에 저장
if max == 1: # 최댓값이 1이면 가장 많이 사용된 알파벳이 1개 밖에 없으므로 저장된 a를 출력함
    print(a)
else: # 최댓값이 1보다 큰것이므로 가장 많이 사용된 알파벳이 여러 개 존재하므로 ?를 출력.
    print('?')
