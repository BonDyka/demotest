<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add User</title>
</head>
<body>
    <h1>User Data</h1>
    <p>Change data what you want.</p>
    <form name="user" action="/update" method="post">
        <input type="text" name="id" value="${user.id}" hidden />
        <input type="text" name="name" value="${user.name}" /><br />
        <input type="text" name="email" value="${user.email}" /><br />
        <input type="text" name="age" value="${user.age}" /><br />
        <input type="submit" value="OK" />
    </form>
</body>
</html>