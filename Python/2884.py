hour, minute = map(int, input().split())

if (minute - 45) < 0:
    if hour == 0:
        hour = 23
    else:
        hour -= 1
    minute = 60 + (minute - 45)
else:
    minute -= 45

print("%d %d" % (hour, minute))
