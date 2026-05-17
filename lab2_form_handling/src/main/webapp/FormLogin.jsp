<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html lang="en">
    <head>
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="/login/check" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            <br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            <br>

            <label for="gender">Gender:</label>
            <input type="radio" id="male" name="gender" value="Male" required>
            <label for="male">Male</label>
            <input type="radio" id="female" name="gender" value="Female" required>
            <label for="female">Female</label>
            <br>

            <label for="hobbies">Hobbies:</label>
            <input type="checkbox" id="reading" name="hobbies" value="Reading">
            <label for="reading">Reading</label>
            <input type="checkbox" id="sports" name="hobbies" value="Sports">
            <label for="sports">Sports</label>
            <input type="checkbox" id="travel" name="hobbies" value="Travel">
            <label for="travel">Travel</label>
            <input type="checkbox" id="music" name="hobbies" value="Music">
            <label for="music">Music</label>
            <br>

            <label for="city">City:</label>
            <select id="city" name="city" required>
                <option value="Ho Chi Minh">Ho Chi Minh</option>
                <option value="Ha Noi">Ha Noi</option>
                <option value="Da Nang">Da Nang</option>
                <option value="Hue">Hue</option>
            </select>
            <br><br>
            
            <input type="submit" value="Login">
        </form>
    </body>
</html>