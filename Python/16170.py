from datetime import datetime

utc = datetime.utcnow()
result = [utc.year, utc.month, utc.day]
for i in result:
    print(i)
