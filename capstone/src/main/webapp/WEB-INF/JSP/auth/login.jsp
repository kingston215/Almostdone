<jsp:include page="../Include/Header.jsp"/>


<div class="container">
    <form id="signInForm" action="/auth/login/loginSubmit" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <h2>Sign In</h2>
        <div class="input-group">
            <label for="username">Username</label>
            <input type="text" id="username" name="username" required>
        </div>
        <div class="input-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>
        </div>
        <button type="submit">Sign In</button>
        <p id="errorMessage"></p>
    </form>
</div>
<%--<script src="scripts.js"></script>--%>


<jsp:include page="../Include/Footer.jsp"/>