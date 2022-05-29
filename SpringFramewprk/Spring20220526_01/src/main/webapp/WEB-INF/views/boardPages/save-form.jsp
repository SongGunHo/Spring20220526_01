<%--
  Created by IntelliJ IDEA.
  User: 송근호
  Date: 2022-05-26
  Time: 오후 5:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>save.jsp</h2>
    <form action="/save" method="post">
    <input type="text" name="memberId" placeholder="memberId">
    <input type="text" name="memberPassword" placeholder="memberPassword">
    <input type="text" name="memberName" placeholder="memberName">
    <input type="text" name="memberEmail" placeholder="memberEmail">
    <input type="text" name="memberMobile" placeholder="memberMobile">
    <input type="text" name="memberProfile" placeholder="memberProfile">
    <input type="submit" value="회원가입">
    </form>
</body>
<%--    <script>--%>
<%--        const Check =()=>{--%>
<%--            const md = document.getElementById("memberId").value;--%>
<%--            const mdDB = "${member.id}";--%>
<%--            if(md== mdDB){--%>
<%--                location.href="";--%>

<%--            }else {--%>
<%--                alert("중복된아이디입니다 ")--%>
<%--                location.href="";--%>
<%--            }--%>
<%--        }--%>
<%--    </script>--%>
</html>
