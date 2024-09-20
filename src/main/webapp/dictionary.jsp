<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title>Page Title</title>
    <style>

        body {
            font-family: 'lato', sans-serif;
        }

        .container {
            max-width: 1000px;
            margin-left: auto;
            margin-right: auto;
            padding-left: 10px;
            padding-right: 10px;
        }

        h2 {
            font-size: 26px;
            margin: 20px 0;
            text-align: center;
        }

        .responsive-table {
            list-style-type: none;
            padding: 0;
        }

        li {
            border-radius: 3px;
            padding: 25px 30px;
            display: flex;
            justify-content: center;
            margin-bottom: 25px;
            text-align: center;
        }

        .table-header {
            background-color: #95A5A6;
            font-size: 14px;
            text-transform: uppercase;
            letter-spacing: 0.03em;
            text-align: center;
        }

        .table-row {
            background-color: #ffffff;
            box-shadow: 0px 0px 9px 0px rgba(0, 0, 0, 0.1);
            justify-content: center;
        }

        .col-1 {
            flex-basis: 100%;
            text-align: center;
        }

        @media all and (max-width: 767px) {
            .table-header {
                display: none;
            }

            .table-row {
                display: block;
            }

            li {
                display: block;
            }

            .col {
                flex-basis: 100%;
                display: flex;
                justify-content: center;
            }

            .col {
                display: flex;
                padding: 10px 0;
                text-align: center;
            }
        }

    </style>
</head>
<body>

<div class="container">
    <h2>Dictionary Words</h2>
    <ul class="responsive-table">
        <li class="table-header">
            <div class="col col-1">Words</div>
        </li>

        <!-- JSTL forEach loop to iterate over the list of words -->
        <c:forEach var="word" items="${wordsList}">
            <li class="table-row">
                <div class="col col-1" data-label="Word">${word}</div>
            </li>
        </c:forEach>

    </ul>
</div>

</body>
</html>
