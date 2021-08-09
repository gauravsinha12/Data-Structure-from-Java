try:
    T = int(input())
    li = list(map(int, input().split(" ")))
    for _ in range(0,T):
        if li[0]!=li[1] and li[2]!=li[3]:
            print("2")
        elif li[0]==li[2] and li[1]!=li[3]:
            print("1")
        elif li[0]==li[1] and li[2]!=li[3]:
            print("1")
        elif li[0]==li[3] and li[1]!=li[2]:
            print("1")
        elif li[1]==li[2] and li[0]!=li[3]:
            print("1")
        elif li[1]==li[3] and li[0]!=li[2]:
            print("1")
        elif li[2]==li[3] and li[0]!=li[1]:
            print("1")
        elif li[0]==li[1]==li[2]==li[3]:
            print("0")
except Exception as e:
    pass