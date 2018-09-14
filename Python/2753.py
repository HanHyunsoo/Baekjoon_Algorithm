year=int(input())
if year % 4 == 0 and year % 100 != 0 or year % 400 == 0:
    year = 1
else:
    year = 0
print(year)
