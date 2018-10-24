n = int(input())
card = [x for x in range(1, n+1)]
result = []
for i in range(len(card)):
    # 마지막 카드가 남아있으면 result에 추가만하고 멈춘다.
    if len(card) == 1:
        result.append(card[0])
        break
    # 제일 위에 있는 카드를 버린다.
    result.append(card[0])
    del card[0]

    # 그 다음 제일 위에있는 카드를 아래로 옮긴다.
    card.append(card[0])
    del card[0]
for i in result:
    print(i, end=' ')
