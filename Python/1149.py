houseArr = [[0, 0, 0]]
dp = [[0, 0, 0]]
n = int(input())
for i in range(n):
    houseArr.append(list(map(int, input().split())))

for j in range(1, n + 1):
    R = houseArr[j][0] + min(dp[j - 1][1], dp[j - 1][2])
    G = houseArr[j][1] + min(dp[j - 1][0], dp[j - 1][2])
    B = houseArr[j][2] + min(dp[j - 1][0], dp[j - 1][1])
    dp.append([R, G, B])

print(min(dp[n]))