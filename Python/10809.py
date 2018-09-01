# 알파벳 찾
a=[chr(i) for i in range(97,123)]
S=list(input())
result=""
for i in a:
    if S.count(i) > 0:
        result += str(S.index(i)) + " "
    else:
        result += "-1 "
print(result)
