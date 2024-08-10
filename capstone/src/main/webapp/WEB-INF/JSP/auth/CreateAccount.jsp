<jsp:include page="../Include/Header.jsp"/>
<%--<form action="action_page.php">--%>
<%--    <div class="container">--%>
<%--        <h1>Register</h1>--%>
<%--        <p>Please fill in this form to create an account.</p>--%>
<%--        <hr>--%>

<%--        <label for="email"><b>Email</b></label>--%>
<%--        <input type="text" placeholder="Enter Email" name="email" id="email" required>--%>

<%--        <label for="psw"><b>Password</b></label>--%>
<%--        <input type="password" placeholder="Enter Password" name="psw" id="psw" required>--%>

<%--        <label for="psw-repeat"><b>Repeat Password</b></label>--%>
<%--        <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>--%>
<%--        <hr>--%>

<%--        <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>--%>
<%--        <button type="submit" class="registerbtn">Register</button>--%>
<%--    </div>--%>

<%--    <div class="container signin">--%>
<%--        <p>Already have an account? <a href="#">Sign in</a>.</p>--%>
<%--    </div>--%>
<%--</form>--%>


<!-- a page header -->
<section style="background-color:gray">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h1 class="text-center">Create Account</h1>
        </div>
    </div>
</section>


<section>
    <div class="container">
        <div class="row pt-5 ">
            <div class="col-12">
                <form action="auth/create-account" method="post">

                    <!-- email input -->
                    <div class="row align-items-center justify-content-center">
                        <div class="col-2">
                            <label for="emailId" class="col-form-label">Email</label>
                        </div>
                        <div class="col-4">
                            <input type="text" id="emailId" name="email" class="form-control <c:if test="${bindingResult.hasFieldErrors('email')}">is-invalid</c:if>" value="${form.email}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('email')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div class="text-danger">
                                    <c:forEach items="${bindingResult.getFieldErrors('email')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>


                    <!-- password input field -->
                    <div class="row align-items-center justify-content-center pt-3">
                        <div class="col-2">
                            <label for="passwordId" class="col-form-label">Password</label>
                        </div>
                        <div class="col-4">
                            <input type="text"
                                   id="passwordId"
                                   name="password"
                                   class="form-control <c:if test="${bindingResult.hasFieldErrors('password')}">is-invalid</c:if>"
                                   value="${form.password}">
                        </div>
                    </div>
                    <c:if test="${bindingResult.hasFieldErrors('password')}">
                        <div class="row align-items-center justify-content-center">
                            <div class="offset-2 col-4">
                                <div style="color:red">
                                    <c:forEach items="${bindingResult.getFieldErrors('password')}" var="error">
                                        ${error.defaultMessage}<br>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </c:if>

                    <div class="row justify-content-center pt-3 ">
                        <div class="col-auto text-center">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>







<jsp:include page="../Include/Footer.jsp"/>