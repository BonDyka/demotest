<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Users List</title>
</head>
<body>
    <h1>Users List</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>age</th>
        </tr>
    <#list users as user>
        <tr>
            <td><a href="/user/${user.id}"> ${user.id}</a></td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.age}</td>
            <td>
                <a href="/update/${user.id}"> EDIT</a>
                <a href="/delete/${user.id}">DELETE </a>
            </td>
        </tr>
    </#list>
    </table>

    <a href="/add">Add user</a>
</body>
</html>