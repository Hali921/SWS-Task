<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
   <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>test</title>
</head>
<body>
  <form method="post" action="/adduser">
    <label>Фамилия:
      <input name="last_name" placeholder="Фамилия">
    </label>
    <label>Имя:
      <input name="first_name" placeholder="Имя">
    </label>
    <label>Отчество:
      <input name="patronymic" placeholder="Отчество">
    </label>
    <label>Email:
    <input name="email" placeholder="email">
    </label>
    <label>Phone:
    <input name="phone_number" placeholder="Phone">
    </label>
    <input type="submit" value="Добавить">
  </form>
<br>
  <table border="1" width="90%">
    <#list users as user>
    <tr>
      <td align="center">${user.id}</td>
      <td align="center">${user.last_name}</td>
      <td align="center">${user.first_name}</td>
      <td align="center">${user.patronymic}</td>
      <td align="center">${user.email}</td>
      <td align="center">${user.phone_number}</td>

    </tr>
  </#list>
  </table>

</body>
</html>