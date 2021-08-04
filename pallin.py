str = input()
st = str.replace(" ",'')
if(st[::-1]==st):
    print('true')
else:
    print('false')