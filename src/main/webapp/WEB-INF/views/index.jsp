
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Students</title>
    <link rel="stylesheet" href="/css/style.css">
    <script src="/js/script.js"></script>
</head>
<body>
<div onclick="show('none')" id="gray"></div>
<div id="window">
    <div class="form">
        <h2>Add new student</h2>
        <s:form modelAttribute="student" action="save">
            <s:input path="name" cssClass="input" id="name"/>
            <s:input path="grade" cssClass="input" id="grade"/>
            <input type="submit" value="Create">
        </s:form>
    </div>
</div>
<div class="container">
    <h1>Student</h1>
    <a onclick="show('block')" class=button7>Add new student</a>
    <br/>
    <table class="table">
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Grade</th>
                <th>Edit</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${studentList}" var="s">
            <c:url var="deleteLink" value="/delete">
                <c:param name="studentId" value="${s.id}"/>
            </c:url>
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>${s.grade}</td>
                <td>
                    <a href="${deleteLink}"
                       onclick="if(!(confirm('Are you sure you wanna delete this record'))) return false">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
