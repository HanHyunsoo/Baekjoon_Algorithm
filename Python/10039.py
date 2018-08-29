student=[]
result=0
for i in range(5):
    student.append(int(input()))
    if student[i] < 40:
        student[i]= 40
for i in student:
    result += i
print(int(result/5))
