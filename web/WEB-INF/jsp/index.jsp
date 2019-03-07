<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SuperCart - The amazing cart built on Java EE</title>
    </head>

    <body>
        <form name="loginForm" action="products.html" method="POST">
            <p>
                <label for="username">Username: </label>
                <input type="text" name="username" value="admin" size="45" />
            </p>
            <p>
                <label for="password">Password: </label>
                <input type="password" name="password" value="admin" size="45" />
            </p>
            <p>
                <input type="submit" value="Login" name="login" />
            </p>
        </form>
    </body>
</html>
