result = ''
for i in range(1, 6):
    FBI = input()
    if FBI.count("FBI") > 0:
        result += str(i) + " "
if result == '':
    print("HE GOT AWAY!")
else:
    print(result)
