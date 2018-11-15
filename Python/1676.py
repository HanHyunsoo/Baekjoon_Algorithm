def f(n):
    if n == 1 or n == 0:
	    return 1
    result = 1
    for i in range(2, n + 1):
	    result *= i
    return result

count = 0
n = f(int(input()))
while n % 10 == 0:
    n = n // 10
    count += 1
print(count)
