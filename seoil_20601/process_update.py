#!C:\Users\PC-001\AppData\Local\Programs\Python\Python37\python.exe
import cgi,os

form = cgi.FieldStorage()
pageId=form["pageId"].value
title=form["title"].value
description=form["description"].value

open_file=open('data/'+pageId, 'w')
open_file.write(description)
open_file.close()
os.rename("data/"+pageId, "data/"+title)

#Redirection
print("Location: menu4.py?id="+title)
print()
