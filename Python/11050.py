def factorial(n):
    if n == 0 or n == 1:
        return 1
    return n * factorial(n - 1)

def binomial_coefficient(n, k):
    return factorial(n) // (factorial(k) * factorial(n - k))

n, k = map(int, input().split())
print(binomial_coefficient(n, k))
