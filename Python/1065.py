def hansu(i): # 한수면 1, 아니면 0을 반환
    i=str(i)
    i=list(map(int,i)) # i를 정수형 리스트로 나눔
    a,n,d=i[0],len(i),i[len(i)-1]-i[len(i)-2] # a=첫 항, n=n번째 항(마지막 항), d=공차
    if a >= 1 and a <= 1000 and a+(n-1)*d==i[len(i)-1]: # 1 <= (입력 받은 수) <= 1000, 마지막 항과 a+(n-1)*d 를 만족하면 1을 반환
        return 1
    else: # 나머지는 0을 반환(공식이 성립이 안되거나 입력 받은 수의 범위를 벗어남)
        return 0

n=input()
result=0
for i in range(int(n)+1): # int(n)+1은 <= int(n)과 같음
    result += hansu(i)
print(result) # hansu 함수에서 반환하는 값은 한수의 수와 같으므로 for문으로 한수의 개수를 구
