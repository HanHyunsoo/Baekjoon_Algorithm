import sys

for i in range(int(input())):
    n, string = input().split()
    for j in string:
        sys.stdout.write(j * int(n))
    sys.stdout.write('\n')
