E, S, M = map(int, input().split())
year = 1
while 1:
    if E == 1 and S == 1 and M == 1:
        break

    year += 1
    E -= 1
    S -= 1
    M -= 1
    
    if E < 1:
        E = 15
    if S < 1:
        S = 28
    if M < 1:
        M = 19
print(year)
