patterns = []

for i in range(int(input())):
    patterns.append(input())
result_pattern = list(patterns[0])

for j in patterns[1:]:
    for k in range(len(j)):
        if j[k] != result_pattern[k]:
            result_pattern[k] = "?"

print("".join(result_pattern))
