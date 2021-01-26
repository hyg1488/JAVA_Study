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

else:
    pageId='수리 견적에대해 질문을 올리는 게시판입니다.'
    hiweb = '* 견적은 직접 방문하여 전문가와 상담하시는 것이 정확하며 글을 올리실때 사진 자료가 있으면 더욱 자세하게 견적 내용을 알 수 있습니다.'

#data 값을 가져와 반복문을 돌려 리스트 문자열로 생성해 출력
files=os.listdir('data')
file_list=''
for i in files:
    file_list=file_list+('<a href="menu4.py?id={file_list}"><li>{file_list}</li></a>'.format(file_list=i))

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
        div a {{
            width: 6%;
            height:20%;
            display: table-cell;
            vertical-align: middle;
          }}
          div{{
            border-bottom: 2px solid black;
          }}
          .obj{{
          float:right;
          }}

        </style>
  </head>
  <body>
      <div>
      <a href="main.html" id="seoil"><img src="image/seoil2.png" width="150"></a>
      <a href="menu1.html" id="gridseed2" type="menu"><strong>회사소개</strong></a>
      <a href="menu2.html" id="gridseed2" type="menu"><strong>조직도</strong></a>
      <a href="menu3.html" id="gridseed2" type="menu"><strong>대표인사말</strong></a>
      <a href="menu4.py" id="gridseed2" type="menu"><strong>견적문의</strong></a>
      <a href="menu5.html" id="gridseed2" type="menu"><strong>고객센터</strong></a>
    </div>
    <p>
    <input type="text" onchange="alert('검색 기능은 준비중입니다.')">
    <input type="button" value="검색" onclick="alert('검색 기능은 준비중입니다.')">
    <input type="button" value="night"onclick="daynight(this)">
    </p>


    <h1><a href="menu4.py">견적문의</a></h1>
    <ul>{file}</ul>
        <a href='menu4.py' style="text-decoration: underline">글쓰기 창 닫기</a>
        <form action="process_update.py" method="post">
        <input type="hidden" name="pageId" value={title}>
        <p><input type="text"  name="title" placeholder="제목을 입력하세요." value="{title}"></p>
        <p><textarea name="description" placeholder="내용을 입력하세요." style="height: 400px; width:800px;">{description}</textarea></p>
        <p><input type="submit"></p>
        </form>

  </body>
</html>
'''.format(title=pageId, description=hiweb, file=file_list)
)


# <link rel="stylesheet" type="text/csss" href="text.css" />
# <link rel="shortcut icon" type="image⁄x-icon" href="image\Originals\wash.jpg">
# 이걸 넣으면 실행이 안되는데 왜그런지 나중에 알아보기
