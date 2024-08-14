<jsp:include page="Include/Header.jsp"/>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<section>


        <form class="form" <c:choose>
            <c:when test="${form == null}">
                action="/Reservations"
            </c:when>
            <c:otherwise>
                action="/edit/${form.id}"
            </c:otherwise>
        </c:choose> method="post">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <input type="hidden" name="id" value="${form.id}">

            <div class="row justify-content-center m-4">

                <div class="col-6">
                    <input value="${form.email}" id="email" name="email" class="form-control"
                           type="email"
                           placeholder="E-mail"
                           aria-description="email input">
                </div>
            </div>
            <c:if test="${form == null}">
                <div class="row justify-content-center m-4">
                    <div class="col-6">
                        <input id="password" name="password" class="form-control"
                               type="password"
                               placeholder="Password"
                               aria-description="password input">
                    </div>
                </div>
            </c:if>

            <div class="row justify-content-center m-4">

                <div class="col col-3">
                    <input value="${form.age}" id="age" name="age"
                           placeholder="Age"
                           class="form-control" type="number"
                           aria-description="age input" />
                </div>




            </div>
            <div class="row justify-content-center text-center col-1">
                <div class="col col-1">
                <button type="submit" class="btn btn-primary m-1">Submit</button>
            </div>
            </div>
        </form>

</section>

<%--<!-- Navigation -->--%>
<%--<div class="container">--%>
<%--    <div class="row">--%>
<%--        <!-- Navigation content here -->--%>
<%--    </div>--%>
<%--</div>--%>

<%--<!-- Reservations Heading -->--%>
<%--<div class="container text-center">--%>
<%--    <h2 class="translucent-text">Reservations</h2>--%>
<%--</div>--%>

<%--<!-- Contact Form -->--%>
<%--<div class="container translucent-form">--%>
<%--    <form action="action_page.php">--%>
<%--        <label for="fname"><strong>First Name:</strong></label>--%>
<%--        <input type="text" id="fname" name="firstname" placeholder="Your name..">--%>

<%--        <label for="lname"><strong>Last Name:</strong></label>--%>
<%--        <input type="text" id="lname" name="lastname" placeholder="Your last name..">--%>

<%--        <label for="email"><strong>Email:</strong></label>--%>
<%--        <input type="text" id="email" name="email" placeholder="Your email..">--%>

<%--        <label for="number"><strong>Number:</strong></label>--%>
<%--        <input type="text" id="number" name="number" placeholder="Your number..">--%>
<%--    </form>--%>
<%--</div>--%>

<%--<!-- Reservation Form -->--%>
<%--<div class="container text-center translucent-form">--%>
<%--    <div class="reservation-form">--%>
<%--        <h2 class="translucent-text">Book Your Table</h2>--%>
<%--        <form id="reservationForm">--%>


<%--            <label for="date" class="bold-label">Select Date:</label>--%>
<%--            <input type="date" id="date" name="date" required>--%>

<%--            <label for="time" class="bold-label">Select Time:</label>--%>
<%--            <select id="time" name="time" required>--%>
<%--                <option value="9:00 AM">9:00 AM</option>--%>
<%--                <option value="9:30 AM">9:30 AM</option>--%>
<%--                <option value="10:00 AM">10:00 AM</option>--%>
<%--                <option value="10:30 AM">10:30 AM</option>--%>
<%--                <option value="11:00 AM">11:00 AM</option>--%>
<%--                <option value="11:30 AM">11:30 AM</option>--%>
<%--                <option value="12:00 PM">12:00 PM</option>--%>
<%--                <option value="12:30 PM">12:30 PM</option>--%>
<%--                <option value="1:00 PM">1:00 PM</option>--%>
<%--                <option value="1:30 PM">1:30 PM</option>--%>
<%--                <option value="2:00 PM">2:00 PM</option>--%>
<%--                <option value="2:30 PM">2:30 PM</option>--%>
<%--                <option value="3:00 PM">3:00 PM</option>--%>
<%--                <option value="3:30 PM">3:30 PM</option>--%>
<%--                <option value="4:00 PM">4:00 PM</option>--%>
<%--                <option value="4:30 PM">4:30 PM</option>--%>
<%--                <option value="5:00 PM">5:00 PM</option>--%>
<%--                <option value="5:30 PM">5:30 PM</option>--%>
<%--                <option value="6:00 PM">6:00 PM</option>--%>
<%--                <option value="6:30 PM">6:30 PM</option>--%>
<%--                <option value="7:00 PM">7:00 PM</option>--%>
<%--                <option value="7:30 PM">7:30 PM</option>--%>
<%--                <option value="8:00 PM">8:00 PM</option>--%>
<%--                <option value="8:30 PM">8:30 PM</option>--%>
<%--                <option value="9:00 PM">9:00 PM</option>--%>
<%--            </select>--%>

<%--            <label for="people" class="bold-label">Number of People:</label>--%>
<%--            <input type="number" id="people" name="people" min="1" max="20" required>--%>

<%--            <label for="occasion" class="bold-label">Occasion:</label><br>--%>
<%--            <div>--%>
<%--                <input type="checkbox" id="birthday" name="occasion" value="Birthday">--%>
<%--                <label for="birthday">Birthday</label><br>--%>

<%--                <input type="checkbox" id="wedding" name="occasion" value="Wedding">--%>
<%--                <label for="wedding">Wedding</label><br>--%>

<%--                <input type="checkbox" id="anniversary" name="occasion" value="Anniversary">--%>
<%--                <label for="anniversary">Anniversary</label><br>--%>

<%--                <input type="checkbox" id="corporate" name="occasion" value="Corporate">--%>
<%--                <label for="corporate">Corporate Meetings</label><br>--%>

<%--                <input type="checkbox" id="holiday" name="occasion" value="Holiday">--%>
<%--                <label for="holiday">Holiday Parties</label><br>--%>

<%--                <input type="checkbox" id="other" name="occasion" value="Other">--%>
<%--                <label for="other">Other</label><br>--%>
<%--            </div>--%>

<%--            <!-- Seating Preference -->--%>
<%--            <p><strong>Please select your seating:</strong></p>--%>
<%--            <input type="radio" id="indoor" name="seating" value="In-door">--%>
<%--            <label for="indoor">In-door</label><br>--%>
<%--            <input type="radio" id="outdoor" name="seating" value="Out-door">--%>
<%--            <label for="outdoor">Out-door</label><br>--%>

<%--            <label for="deposit">Deposit Amount:</label>--%>
<%--            <input type="number" id="deposit" name="deposit" min="0" required>--%>

<%--            <button type="submit">Reserve</button>--%>
<%--        </form>--%>
<%--    </div>--%>
<%--</div>--%>






<jsp:include page="Include/Footer.jsp"/>