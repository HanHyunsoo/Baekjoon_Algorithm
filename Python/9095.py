for i in range(int(input())):
    dp = [0, 1, 2, 4]
    n = int(input())
    if n > 3:
        for j in range(4, n + 1):
            dp.append(dp[j - 1] + dp[j - 2] + dp[j - 3])
    print(dp[n])