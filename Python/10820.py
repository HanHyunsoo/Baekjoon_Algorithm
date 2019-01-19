while True:
    try:
        text = input()
        
        small_letter = 0
        capital_letter = 0
        number = 0
        blank = 0
        
        for i in text:
            if ord(i) >= 97 and ord(i) <= 122:
                small_letter += 1
            elif ord(i) >= 65 and ord(i) <= 90:
                capital_letter += 1
            elif ord(i) >= 48 and ord(i) <= 57:
                number += 1
            else:
                blank += 1

        print("%d %d %d %d" % (small_letter, capital_letter, number, blank))
    except EOFError:
        break
