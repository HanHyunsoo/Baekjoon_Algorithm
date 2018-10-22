vowel = ['a', 'e', 'i', 'o', 'u']
word = input()
result = 0
for i in vowel:
    result += word.count(i)
print(result)
