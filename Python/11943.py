firstBasket = list(map(int, input().split()))
secondBasket = list(map(int, input().split()))
checkMin = [firstBasket[0] + secondBasket[1], firstBasket[1] + secondBasket[0]]
print(min(checkMin))