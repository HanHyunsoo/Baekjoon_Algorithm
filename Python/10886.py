vote = []
for i in range(int(input())):
    vote.append(int(input()))
if vote.count(0) > vote.count(1):
    print("Junhee is not cute!")
else:
    print("Junhee is cute!")
