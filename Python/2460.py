max_people = 0
case_people = 0
for i in range(10):
    out_train, in_train = map(int, input().split())
    case_people += in_train - out_train
    if max_people < case_people:
        max_people = case_people
print(max_people)
