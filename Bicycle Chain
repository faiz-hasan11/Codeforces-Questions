n=input()
a1=input()
a=a1.split()
m=input()
b1=input()
b=b1.split()
k=int(n)*int(m)
c=[0]*k
p=0
for i in a:
    for j in b:
        if (int(j)%int(i))  == 0:
            c[p]=(int(j)/int(i))
            p+=1
c.sort()
c.reverse()
u=c.count(c[0])
print(u)

