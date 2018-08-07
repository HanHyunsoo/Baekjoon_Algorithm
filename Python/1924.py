# 사전을 이용해 월마다 일수, 요일을 저장
month={1:31, 2:28, 3:31, 4:30, 5:31, 6:30, 7:31, 8:31, 9:30, 10:31, 11:30, 12:31}
week={0:"SUN", 1:"MON", 2:"TUE", 3:"WED", 4:"THU", 5:"FRI", 6:"SAT"}

month_input, day_input = map(int, input().split())

# 입력받은 월의 각각 일수를 day_input에 더한다.(사전에 0이라는 키가 없기 때문에 오류 따라서  continue)
for i in range(month_input):
    if i == 0:
        continue
    day_input += month[i]

# 총 더한 day_input을 7로 나누어 나머지에 따라 요일을 말해줌.(위에 있는 week 사전 참고)
print(week[day_input%7])
