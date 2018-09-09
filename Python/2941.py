# 크로아티아 알파벳 튜플을 생성
alphabet = ("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

word = input()

# word 문자열에서 크로아티아 알파벳이 있으면 "1"로 바꾼다.
for i in alphabet:
    word = word.replace(i, "1")

# word의 길이를 센다.
print(len(word))
