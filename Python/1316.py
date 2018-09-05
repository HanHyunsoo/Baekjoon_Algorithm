n = int(input())
count = 0 # count 변수는 그룹 단어의 개수
for i in range(n): # n번 만큼 단어를 입력 받는다.
    word = input()
    result = '' # result를 빈 str로 초기화
    for j in word:
        if word.count(j) == 1: # j가 word 문자열에서 1개밖에 없으면 continue
            continue
        else: # j가 1개보다 많으면
            result = word[word.index(j):word.rindex(j)] # j의 첫번째 인덱스와 끝 인덱스 사이를 문자열로 result변수에 저장.
            if result.count(result[0]) == len(result): # 첫번째 글자의 개수와 result의 길이가 같으면
                result = '' # result를 다시 빈 str로 초기화하고 continue
                continue
            else: # 그 밖의 경우는 그룹 문자가 아닌걸로 간주하며 반복문을 멈춘다.
                break
    if result == '': # result가 빈 str이면 그룹 문자이므로 count에 1을 더해준다.
        count += 1
print(count)
    
