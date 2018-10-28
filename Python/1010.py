def f(n): # 팩토리얼
    result = 1
    for i in range(1, n+1):
        result *= i
    return result

def c(n, r): # 조합
    return f(n) // (f(r) * f(n-r))

for i in range(int(input())):
    a, b = map(int, input().split())
    print(c(b, a)) # a <= b
