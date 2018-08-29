a,b=[str(i) for i in range(1,9)],[str(j) for j in range(8,0,-1)]
n=list(input().split())
if n == a:
    print("ascending")
elif n == b:
    print("descending")
else:
    print("mixed")
