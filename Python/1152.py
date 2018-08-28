A=int(input())
B=int(input())
C=int(input())
result=[int(i) for i in list(str(A*B*C))]
for i in range(10):
	print(result.count(i))
