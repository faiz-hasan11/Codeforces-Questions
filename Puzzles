a1=input()
a=a1.split()
b1=input()
b=b1.split()
b=list(map(int,b))
b.sort()
n=int(a[0])
m=int(a[1])
y=m-n
k=1000
for i in range(y+1):
    if (int(b[i+n-1])-int(b[i])) < k:
        k=int(b[i+n-1])-int(b[i])
print(k)

