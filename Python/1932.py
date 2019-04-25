dp = []
n = int(input())

for i in range(n):
    inputNums = list(map(int, input().split()))
    dp.append(inputNums)

for j in range(1, n):
    for k in range(len(dp[j])):
        if k == 0:
            dp[j][k] += dp[j - 1][k]
        elif k == j:
            dp[j][k] += dp[j - 1][k - 1]
        else:
            dp[j][k] = max(dp[j][k] + dp[j - 1][k - 1], dp[j][k] + dp[j - 1][k])
        
print(max(dp[n - 1]))