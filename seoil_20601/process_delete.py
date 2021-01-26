#!C:\Users\PC-001\AppData\Local\Programs\Python\Python37\python.exe
import cgi, os


form = cgi.FieldStorage()
pageId=form["pageId"].value

os.remove('data/'+pageId)

#Redirection
print("Location: menu4.py")
print()
