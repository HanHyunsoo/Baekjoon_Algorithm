n = int(input())

# n을 대각선 기준으로 줄을 나눠야하므로 i에 마지막값에 1씩 추가한 값을 리스트에 추가
# i의 총합이 n보다 커질때 까지 반복 여기서 i의 마지막 값은 n이 해당하는 줄
i = [1]
while sum(i) < n:
    i.append(i[-1]+1)

# result라는 리스트에 해당 줄에 해당하는 분수값들 저장
result = []
for j in range(1, i[-1] + 1):
    result.append((i[-1] - j + 1, j))

# 해당줄이 홀수면 왼쪽에서 오른쪽으로 분수를 세고 짝수면 그 반대이므로 리스트를 반대로.
if i[-1] % 2 == 0:
    result.reverse()

# n-sum(i[0:-1])-1는 입력받은 n의 값의 인덱스를 구하기위한 식
# 예) n이 14면 14-9-1 = 4, 따라서 result[4]가 n이 해당하는 위
print("%d/%d" % (result[n-sum(i[0:-1])-1][0], result[n-sum(i[0:-1])-1][1]))
