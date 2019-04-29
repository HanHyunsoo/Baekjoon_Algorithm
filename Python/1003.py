for i in range(int(input())):
    dp = [[1, 0], [0, 1]]
    n = int(input())
    for j in range(2, n + 1):
        dp.append([dp[j - 1][0] + dp[j - 2][0], dp[j - 1][1] + dp[j - 2][1]])
    print("%d %d" % (dp[n][0], dp[n][1]))