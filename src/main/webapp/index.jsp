<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trie Dictionary</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f4f4f4;
        }

        .container {
            width: 400px;
            background: white;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            border-radius: 8px;
            text-align: center;
        }

        .container h1 {
            margin-bottom: 20px;
        }

        .input-field {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 16px;
        }

        .button {
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            margin: 10px 5px;
            cursor: pointer;
            background-color: #007bff;
            color: white;
        }

        .button:hover {
            background-color: #0056b3;
        }

        .results {
            margin-top: 20px;
        }

        .results a {
            display: inline-block;
            margin: 0 auto;
            text-align: center;
            color: #007bff;
            text-decoration: none;
        }

        .results a:hover {
            text-decoration: underline;
        }
    </style>

    <!-- SweetAlert2 CDN -->
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>
<body>

<div class="container">
    <h1>Dictionary</h1>
    <form method="post" action="adding">
        <input type="text" name="word" id="wordInput" class="input-field" placeholder="Enter word to add" required>
        <div>
            <button id="addButton" class="button">Add</button>
        </div>
        <div class="results" id="results">
            <a class="link" href="search">Want to Search a word?</a>
        </div>
    </form>
</div>

<script>
    // Check if the message is present and display a SweetAlert alert
    var message = "${message}";
    if (message) {
        Swal.fire({
            title: 'Message',
            text: message,
            icon: 'info',
            confirmButtonText: 'OK'
        });
    }
</script>

</body>
</html>
