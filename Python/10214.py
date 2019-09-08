for i in range(int(input())):
    yonsei_total, korea_total = 0, 0
    for j in range(9):
        yonsei_score, korea_score = map(int, input().split())
        yonsei_total += yonsei_score
        korea_total += korea_score
    
    if yonsei_total > korea_total:
        print("Yonsei")
    elif yonsei_total < korea_total:
        print("Korea")
    else:
        print("Draw")
