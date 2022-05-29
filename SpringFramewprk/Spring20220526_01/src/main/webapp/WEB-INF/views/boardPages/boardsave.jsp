<%--
  Created by IntelliJ IDEA.
  User: 송근호
  Date: 2022-05-27
  Time: 오후 2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>board.save</h2>
    <form action="/boardsave" method="post"></form>
    <a type="text" name="boardId" placeholder="boardId"></a>
    <a type="text" name="boardWriter" placeholder="boardWriter"></a>
    <input type="submit" value="글쓰기">

</body>
</html>
