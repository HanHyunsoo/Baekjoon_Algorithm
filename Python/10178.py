for i in range(int(input())):
    candy, n = map(int, input().split())
    print("You get %d piece(s) and your dad gets %d piece(s)." % (candy // n, candy % n))
