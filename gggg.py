
t=int(input())

for i in range(t):
	r,k=tuple(int(num) for num in input().split(' '))
	count=0
	for j in range(1,r+1):
		s=bin(j).lstrip("0b")  #Removing trailing substring '0b'
		occurences=0
		while True:
			try:
				indx=s.index("101") #Finding index of substring '101'
				occurences+=1
				s=s[indx+2:]
			except:
				break
		if occurences>=k: #If number of occurences of substring "101" is greater than k
			count+=1
	print(count)