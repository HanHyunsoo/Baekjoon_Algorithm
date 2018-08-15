number=int(input())
score=list(map(float,input().split()))
score.sort(reverse=1)
result=0
for i in range(number):
    result += score[i]/score[0]*100
print("%0.2f" % (result/number))
