<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Dashboard</title>
    
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
    <h1>Welcome, ${student.user.name}</h1>
    <img src="${student.photo}" alt="Profile Picture">
    <p>Email: ${student.user.email}</p>
    <p>Department: ${student.department.name}</p>
    <p>Year: ${student.year}</p>

    <h2>Search Students</h2>
    <input type="text" id="search" placeholder="Search by name or department" oninput="searchStudents()">
    <div id="searchResults">
    
    </div>

    <script >
    function searchStudents() {
        const query = document.getElementById('search').value.toLowerCase();
        const resultsDiv = document.getElementById('searchResults');
        
        // Logic to filter and display students based on query
        // This will usually involve an AJAX call to the backend
    }

    </script>
</body>
</html>
