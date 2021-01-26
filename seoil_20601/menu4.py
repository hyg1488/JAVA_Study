#!C:\Users\PC-001\AppData\Local\Programs\Python\Python37\python.exe

import sys,io,os, cgi

print("Content-Type: text/html")
print()


#한글을 사용하기 위해 필요한 선언들
sys.stdout=io.TextIOWrapper(sys.stdout.detach(), encoding='utf-8')
sys.stderr=io.TextIOWrapper(sys.stderr.detach(), encoding='utf-8')

# cgi id 값을 저장해 변수로 저장해서 출력
# cgi id 값과 연결된 데이터를 불러와 화면에 출력

form = cgi.FieldStorage()
if 'id' in form:
    pageId=form["id"].value
    hiweb=open('data/'+pageId, 'r').read()
    hiweb=hiweb.replace('<', '&lt;')
    hiweb=hiweb.replace('>', '&gt;')

    update_link='<a href="update.py?id={}"><input type="button" value="수정"></a>'.format(pageId)
    delete_action='''
        <form style="display:inline" action="process_delete.py" method="post">
            <input type="submit" value="삭제">
            <input type="hidden" name="pageId" value="{}">
        </form>
    '''.format(pageId)
else:
    pageId='<br>'
    hiweb = '<br>'
    update_link='''&nbsp;'''
    delete_action='''&nbsp;'''
    delete_action=''

#data 값을 가져와 반복문을 돌려 리스트 문자열로 생성해 출력
files=os.listdir('data')
file_list=''
file_list_number=1
number=1
for i in files:
    if number>=10:
        file_list=file_list+('<div style="display:inline;">{number}</div><a style="margin-left:90px" href="menu4.py?id={file_list}">{file_list}</a><br>'.format(file_list=i, number=number))
        number+=1
    else: file_list=file_list+('{number}<a style="margin-left:100px" href="menu4.py?id={file_list}">{file_list}</a><br>'.format(file_list=i, number=number))
    number+=1

print('''
<!DOCTYPE html>
<html lang="ko" dir="ltr">
  <head>
    <meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE,chrome=1" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0 maximum-scale=1.0 user-scalable=no" />
  <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=Edge">
  <title>Seoil Moters</title>
    <link rel="shortcut icon" type="image⁄x-icon" href="image/mark.png">

    <title>HTML</title>
        <script>
          function daynight(self){{
            var target=document.querySelector('body');
            if (self.value=='night'){{
              target.style.backgroundColor='black';
              target.style.color='white';
              self.value='day';
            var alist=document.querySelectorAll('a')
            var i=0;
            while(i<alist.length){{
              alist[i].style.color='powderblue';
              i=i+1;
            }}

            }} else {{
              target.style.backgroundColor='white';
              target.style.color='black';
              self.value='night';
              var alist=document.querySelectorAll('a')
              var i=0;
              while(i<alist.length){{
                alist[i].style.color='blue';
                i=i+1;
             }}
            }}
          }}
        </script>

        <style>

        a{{
          text-decoration: none;
          color:black;

        }}
        ol{{
            display:table;
            margin-left:auto;
            margin-right: auto;
        }}

        #text{{
            text-align:center;
            color:white;
            background-color: gray;

        }}

        h1,h2,h3{{
            text-align:center;
        }}

        #gridseed2,#gridseed{{
			width: 5%;
			height:20%;
            text-align:center;
			display: table-cell;
			vertical-align: middle
          }}



          #sm{{
			margin-left: 20%;
			margin-right: 20%;
			margin-bottom: 50px;
          }}

          #ui{{
          float:right;
          display: table-cell;
          }}

          #webworld{{
          margin-top: 50px;
          border:2px solid black;
          margin-left: 20%;
          margin-right: 20%;
          margin-bottom: 50px;
          padding-bottom: 20px;
          }}

        #webworld2{{
            margin-top: 50px;
            border:2px solid black;
            margin-left: 10%;
            margin-right: 10%;
            padding-bottom: 8%;
        }}
          #worldtext{{
            border-top:2px solid black;
            border-bottom: 2px solid black;
          }}
          .ui2{{
          position: fixed; bottom: 0; width: 100%;
          }}

            @media (max-width:1000px){{
            #gridseed2{{
              display: none;

            }}
            }}

            #lastline{{
        border-bottom: 2px solid black;
      }}

      img{{
    margin-bottom: -3px;
    }}
        </style>
  </head>
  <body>
	  <a href="main.html" id="gridseed"><img width="250" src="image/seoil3.png" style="margin-bottom:40px"></a>
      <div id="sm">
      <a href="menu2.html" id="gridseed2" type="menu"><strong>회사소개</strong></a>
      <a href="menu1.html" id="gridseed2" type="menu"><strong>조직도</strong></a>
      <a href="menu3.html" id="gridseed2" type="menu"><strong>대표인사말</strong></a>
      <a href="menu4.py" id="gridseed2" type="menu"><strong>견적문의</strong></a>
      <a href="menu5.html" id="gridseed2" type="menu"><strong>고객센터</strong></a>
    </div>

    <div id="webworld">
    <p><h1 style="margin-top:50px;"> 견적문의</h1></p>
    <h3>수리 견적에대해 질문을 올리는 게시판입니다.</h3>
    <div style="text-align:center; margin-bottom:50px;">견적은 직접 방문하여 전문가와 상담하시는 것이 정확하며 글을 올리실때<br>
    사진 자료가 있으면 더욱 자세하게 견적 내용을 알 수 있습니다.</div><br>
    <div id="ui" type="ui2"><a href='create.py' style="margin-right: 100px; display:inline;"><input type="button" value="글쓰기"></a></div>
    <div id="webworld2">
    <div id="text"><strong>번호</strong> <strong style="margin-left:100px; margin-right:100px">제목</a></strong></div>
    <ol style="margin-bottom:20%;"">{file}</ol><br>
    <h3 style="border-top:2px solid black;"><p>{title}</h3></p>
    <div id="worldtext"><p style="text-align:center">{hi}</p></div><br>
    <div id="ui" type="ui2"><a href='create.py'><input type="button" value="글쓰기"></a>
    {update_link}
    {delete_action}</div></div>
    </div>
	<div id="ui" style="margin-right:20%;">
    <input type="text" onchange="alert('검색 기능은 준비중입니다.')">
    <input type="button" value="검색" onclick="alert('검색 기능은 준비중입니다.')">
    <input type="button" value="night"onclick="daynight(this)">
    </div><br>
<div id="lastline" style="margin-top:20px;"></div><br>
<p style="text-align: center;""><img src="image/saram.jpg"></p>
  </body>
</html>
'''.format(title=pageId, hi=hiweb, file=file_list, update_link=update_link,delete_action=delete_action)
)
# <link rel="stylesheet" type="text/csss" href="text.css" />
# <link rel="shortcut icon" type="image⁄x-icon" href="image\Originals\wash.jpg">
# 이걸 넣으면 실행이 안되는데 왜그런지 나중에 알아보기
