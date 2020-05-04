n1=input()
m1=input()
n=n1.split()
m=m1.split()
c=[0]*int(n[0])
p=0
for i in m:
    if int(i) < 0:
        c[p]=abs(int(i))
        p+=1
c.sort()
c.reverse()
k=0
f=0
if int(n[1])>len(c):
    k=len(c)
else:
    k=int(n[1])
for i in range(k):
    f+=int(c[i])
print(f)
