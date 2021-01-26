#!C:\Users\PC-001\AppData\Local\Programs\Python\Python37\python.exe
import cgi

form = cgi.FieldStorage()
title=form["title"].value
description=form["description"].value

open_file=open('data/'+title, 'w')
open_file.write(description)

#Redirection
print("Location: menu4.py?id="+title)
print()