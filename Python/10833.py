result = 0
for i in range(int(input())):
    student, apple = map(int, input().split())
    result += apple % student
print(result)
