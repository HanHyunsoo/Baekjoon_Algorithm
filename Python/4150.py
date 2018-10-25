def f(n):
    if n == 1 or n == 2: # f(1) = 1, f(2) = 1
        return 1
    Fn = 0 # N번째의 값을 저장하기 위해 0으로 변수선
    F1 = 1 # N-1번째(기본값은 1번째)
    F2 = 0 # N-2번째(기본값은 0번째)
    for i in range(1, n): # 총 n-2번만큼 반복(이미 위에 N-1,N-2 두개의 변수를 선언했기 때문)
        Fn = F1 + F2 # f(n − 1) + f(n − 2)
        F2, F1 = F1, Fn # 각각 1번째를 증가시킨다.
    return Fn

print(f(int(input())))
