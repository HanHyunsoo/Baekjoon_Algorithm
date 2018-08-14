a,b=map(int,input().split())
c=list(map(int,input().split()))
for i in range(a):
    if c[i]>=b:
        c[i]=0
for i in range(c.count(0)):
	c.remove(0)
for i in c:
    print(i, end=' ')
