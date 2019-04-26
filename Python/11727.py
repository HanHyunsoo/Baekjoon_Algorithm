dp = [1, 3]
n = int(input())
for i in range(2, n):
    dp.append((dp[i - 1] + dp[i - 2] * 2) % 10007)
print(dp[n - 1])