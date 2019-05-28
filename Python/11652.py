cards = {}
for i in range(int(input())):
    number = int(input())
    # cards에 입력받은 수에 count를 1씩 더함
    cards[number] = cards.get(number, 0) + 1

# max함수에 딕셔너리를 쓰고 key에 함수를 지정해주면
# value값은 최대로, key값은 최소로 찾는다.
print(max(sorted(cards.keys()), key=(lambda x:cards[x])))
