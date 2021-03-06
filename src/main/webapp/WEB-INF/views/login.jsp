
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            font-family:calibri;
        }

        .login-page {
            width: 360px;
            padding: 8% 0 0;
            margin: auto;
        }

        .form {
            position: relative;
            z-index: 1;
            background: #FFFFFF;
            max-width: 360px;
            margin: 0 auto 100px;
            padding: 45px;
            text-align: center;
            box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
        }

        .form input {
            outline: 0;
            background: #f2f2f2;
            width: 100%;
            border: 0;
            margin: 0 0 15px;
            padding: 15px;
            box-sizing: border-box;
            font-size: 14px;
        }

        .form button {
            text-transform: uppercase;
            outline: 0;
            background: #4CAF50;
            width: 100%;
            border: 0;
            padding: 15px;
            color: #FFFFFF;
            font-size: 14px;
            cursor: pointer;
        }

        .form button:hover,.form button:active,.form button:focus {
            background: #43A047;
        }

        .form .message a {
            color: #4CAF50;
            text-decoration: none;
        }

        .container .info h1 {
            margin: 0 0 15px;
            padding: 0;
            font-size: 36px;
            font-weight: 300;
            color: #1a1a1a;
        }

        .container .info span {
            color: #4d4d4d;
            font-size: 12px;
        }

        .container .info span a {
            color: #000000;
            text-decoration: none;
        }

    </style>
</head>
<body>
<div class="login-page">
    <div class="form">
        <h1>Login</h1>
        <form method="post" class="login-form" action="/login">
            <input type="text" placeholder="Username" id="Username" name="Username"/>
            <input type="password" placeholder="Password" id="Password" name="Password"/>

                <%String errorMsg = (String) session.getAttribute("errorMsg");
                    if(errorMsg != null){%>
                        <p style="color: red"><%=errorMsg%></p>
                <%}%>

            <input type="submit" value="Login"/>
        </form>
    </div>
</div>
</body>
</html>
