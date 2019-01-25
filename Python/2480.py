dice = list(map(int, input().split()))
count = 0

for i in dice:
    if dice.count(i) > 1:
        same = i
        count = dice.count(i)
        break
    
if count == 3:
    result = 10000 + same * 1000
elif count == 2:
    result = 1000 + same * 100
else:
    result = max(dice) * 100
    
print(result)
