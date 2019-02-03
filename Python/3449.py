for i in range(int(input())):
    a = input()
    b = input()
    count = 0
    for i in range(len(a)):
        if a[i] != b[i]:
            count += 1
    print("Hamming distance is %d." % count)
