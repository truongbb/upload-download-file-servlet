<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<h2>Demo JSP-Servlet Upload File</h2>
<form method="post" action="upload" enctype="multipart/form-data">
    Select file to upload: <input type="file" name="file" size="60"/><br/><br/>
    <input type="submit" value="Upload"/>
</form>
</form>
</body>
</html>