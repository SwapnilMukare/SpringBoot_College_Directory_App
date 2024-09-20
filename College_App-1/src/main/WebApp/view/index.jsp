<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>College Directory - Login</title>
    <link rel="stylesheet" href="styles.css">
</head>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
}

.login-container, .dashboard {
    width: 300px;
    margin: 0 auto;
    padding: 20px;
    background: white;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
    text-align: center;
}

.error {
    color: red;
    text-align: center;
}

input, select {
    width: 100%;
    padding: 10px;
    margin: 10px 0;
}

button {
    width: 100%;
    padding: 10px;
    background-color: #5cb85c;
    color: white;
    border: none;
    cursor: pointer;
}


</style>
<body>
    <div class="login-container">
        <h1>Login</h1>
        <form action="/login" method="POST">
            <div>
                <label for="username">Username:</label>
                <input type="text" name="username" required>
            </div>
            <div>
                <label for="password">Password:</label>
                <input type="password" name="password" required>
            </div>
            <div>
                <label for="role">Role:</label>
                <select name="role">
                    <option value="STUDENT">Student</option>
                    <option value="FACULTY_MEMBER">Faculty Member</option>
                    <option value="ADMINISTRATOR">Administrator</option>
                </select>
            </div>
            <button type="submit">Login</button>
        </form>
        <div class="error">
            <c:if test="${not empty error}">
                <p>${error}</p>
            </c:if>
        </div>
    </div>
</body>
<script >
    function searchStudents() {
        const query = document.getElementById('search').value.toLowerCase();
        const resultsDiv = document.getElementById('searchResults');
        
        // Logic to filter and display students based on query
        // This will usually involve an AJAX call to the backend
    }

    </script>
</html>
