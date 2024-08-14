<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Whine4Me</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="/public/CSS/header.css" >
    <link rel="stylesheet" href="/public/CSS/reservation.css">
    <link rel="stylesheet" href="/public/CSS/Events.css">
    <link rel="stylesheet" href="/public/CSS/Menu.css">
    <link rel="stylesheet" href="../../public/CSS/style.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>


</head>
<body>
<div class="row justify-content-center cols-1">

    <div class="col">
        <nav class="navbar navbar-expand-lg navbar-light">
            <a style="padding-left: 5px;" class="navbar-brand" href="/">Whine4Me</a>

            <div class="navbar-expand" id="navbarSupportedContent">

                <ul class="navbar-nav">

                    <li class="nav-item">
                        <a class="nav-link" href="/">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/Menu">Menu</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="/PrivateEvents">Events</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="/ProductCatalog">Catalog</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/auth/login">Login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/Reservations">Sign up</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/search">Search</a>
                    </li>

                    <sec:authorize access="isAuthenticated()">
                        <li class="nav-item">
                            <form action="/auth/logout" method="post">
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                <button class="nav-link" type="submit">Log Out</button>
                            </form>
                        </li>
                        <li>
                            <button class="nav-link"><sec:authentication property="name"/></button>
                        </li>
                    </sec:authorize>
                </ul>

            </div>
        </nav>
    </div>
</div>

    <!--Navigation-->



<%--<nav class="navbar navbar-expand-lg navbar-light">--%>
<%--&lt;%&ndash;        <a href="Home.html" class="">Home</a>&ndash;%&gt;--%>
<%--    <a href="${pageContext.request.contextPath}/">Home</a>--%>
<%--        <a href="/Menu"> Menu</a>--%>
<%--        <a href="/Reservations" class="Reservation">Reservations</a>--%>
<%--        <a href="/PrivateEvents">Events</a>--%>
<%--        <a href="/ProductCatalog">Product Catalog</a>--%>
<%--        <a href="auth/login">Login</a>--%>
<%--    </nav>--%>
