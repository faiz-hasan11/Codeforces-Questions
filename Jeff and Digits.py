n=input()
b1=list(input())
a=b1.count("5")
b=b1.count("0")
b1.sort()
b1.reverse()
t=0
r=""
if b != 0:
    while t==0:
        for i in b1:
            r=r+i
        if (int(r)%90) == 0:
            t=1
        else:
            b1.reverse()
            b1.pop()
            b1.reverse()
            r=""
    print(int(r))
else:
    print("-1")
