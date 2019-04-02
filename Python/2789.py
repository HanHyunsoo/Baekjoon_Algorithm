wordExcept = "CAMBRIDGE"

inputWord = input()
inputWord = list(inputWord)

for i in inputWord:
    if wordExcept.count(i) == 0:
        print(i, end='')