import math

star = ["  *   "," * *  ", "***** "]

def BigStar(space):
    count = len(star)
    for i in range(count):
        star.append(star[i] + star[i])
        star[i] = ("   " * space + star[i] + "   " * space)

N = int(input())
k = int(math.log(int(N / 3), 2))
for i in range(k):
    BigStar(int(pow(2, i)))

for i in range(N):
    print(star[i])
