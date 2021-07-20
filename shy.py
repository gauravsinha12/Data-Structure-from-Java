def fun(d,st,en,l,c,t,ans,final,green,ch):
    if ans//t>ch:
        green=not green
        ch+=1
    if st==en:
        final.append(ans)
        return
    for i in d[st]:
        if str(i) not in l[:-1].split():
            if green:
                fun(d,i,en,l+str(i)+" ",c,t,ans+c,final,green,ch)
            else:
                aq=ans%t  
                fun(d,i,en,l+str(i)+" ",c,t,ans+c+t-aq,final,not green,ch)
    return
        
n,m,t,c=map(int,input().split())
d={}
for i in range(m):
    u,v=map(int,input().split())
    if u in d:
        d[u].append(v)
    else:
        d[u]=[v]
    if v in d:
        d[v].append(u)
    else:
        d[v]=[u]
l="1"
final=[]
green=True
ch=0
ret=fun(d,1,n,l,c,t,0,final,green,ch)
final=set(final)
final=list(final)
final.sort()
if len(final)>1:
    print(final[1])
else:
    print(-1)