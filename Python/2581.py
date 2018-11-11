class Prime_number:
    def __init__(self, m, n):
        self.m = m
        self.n = n
        self.result = []

    def find_prime_number(self):
        for i in range(self.m, self.n + 1):
            test = []
            for j in range(2, i + 1):
                if i % j == 0:
                    test.append(j)
            if len(test) == 1:
                self.result.append(i)

    def print_sum(self):
        print(sum(self.result))

    def print_min(self):
        print(min(self.result))
    
    
a, b = int(input()), int(input())
p = Prime_number(a, b)
p.find_prime_number()

if len(p.result) == 0:
    print(-1)
else:
    p.print_sum()
    p.print_min()
