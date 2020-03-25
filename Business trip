k=input()
m1=input()
m=m1.split()
m=list(map(int,m))
m.sort()
m.reverse()
n=0
t=0
for i in m:
    if n < int(k):
        t+=1
    n+=int(i)
if t==12 and n < int(k):
    print("-1")
else:
    print(t)
