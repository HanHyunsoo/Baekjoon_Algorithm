total = 0
winner = 0
for i in range(1, 6):
    score = sum(map(int, input().split()))
    if total < score:
        winner = i
        total = score
print("{} {}".format(winner, total))
