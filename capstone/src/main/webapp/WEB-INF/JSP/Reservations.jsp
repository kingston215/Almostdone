<jsp:include page="Include/Header.jsp"/>
<!--Navigation-->
<div class="container">
    <div class="row">
    </div>
</div>


<h2 color: style="color: white;" >Reservations</h2>
<div class="container">
    <form action="action_page.php">

        <label for="fname">First Name</label>
        <input type="text" id="fname" name="firstname" placeholder="Your name..">

        <label for="lname">Last Name</label>
        <input type="text" id="lname" name="lastname" placeholder="Your last name..">

        <label for="email">Email</label>
        <input type="text" id="email" name="email" placeholder="Your email..">

        <label for="Number">Number</label>
        <input type="text" id="number" name="number" placeholder="Your number..">



    </form>
</div>

<!-- Reservation Form -->
<div class="reservation-form">
    <h2 style="color: white;">Book Your Table</h2>
    <form id="reservationForm">
        <label for="date">Select Date:</label>
        <input type="date" id="date" name="date" required>

        <label for="time">Select Time:</label>
        <select id="time" name="time" required>
            <option value="9:00 PM">9:00 AM</option>
            <option value="9:30 PM">9:30 AM</option>
            <option value="10:00 PM">10:00 AM</option>
            <option value="10:30 PM">10:30 AM</option>
            <option value="11:00 PM">11:00 AM</option>
            <option value="11:30 PM">11:30 AM</option>
            <option value="12:00 PM">12:00 PM</option>
            <option value="12:30 PM">12:30 PM</option>
            <option value="1:00 PM">1:00 PM</option>
            <option value="1:30 PM">1:30 PM</option>
            <option value="2:00 PM">2:00 PM</option>
            <option value="2:30 PM">2:30 PM</option>
            <option value="3:00 PM">3:00 PM</option>
            <option value="3:30 PM">3:30 PM</option>
            <option value="4:00 PM">4:00 PM</option>
            <option value="4:30 PM">4:30 PM</option>
            <option value="5:00 PM">5:00 PM</option>
            <option value="5:30 PM">5:30 PM</option>
            <option value="6:00 PM">6:00 PM</option>
            <option value="6:30 PM">6:30 PM</option>
            <option value="7:00 PM">7:00 PM</option>
            <option value="7:30 PM">7:30 PM</option>
            <option value="8:00 PM">8:00 PM</option>
            <option value="8:30 PM">8:30 PM</option>
            <option value="9:00 PM">9:00 PM</option>
        </select>

        <label for="people">Number of People:</label>
        <input type="number" id="people" name="people" min="1" max="20" required>

        <label for="occasion">Occasion:</label>
        <select id="occasion" name="occasion" required>
            <option value="Birthday">Birthday</option>
            <option value="Wedding">Wedding</option>
            <option value="Anniversary">Anniversary</option>
            <option value="Corporate">Corporate Meetings</option>
            <option value="Holiday">Holiday Parties</option>
            <option value="Other">Other</option>
        </select>

        <label for="deposit">Deposit Amount:</label>
        <input type="number" id="deposit" name="deposit" min="0" required>

        <button type="submit">Reserve</button>
    </form>
</div>

<!-- Reservation List -->
<div class="reservation-list">
    <h2 style="color: white;">Your Reservations</h2>
    <table id="reservationTable">


    </table>
</div>

<form action="/action_page.php">
    <p style="color: white;">Please select your seating:</p>
     <input type="radio" id="indoor" name="seating" value="In-door">
     <label for="indoor">In-door</label><br>
    <input type="radio" id="outdoor" name="seating" value="Out-door">
     <label for="outdoor">Out-door</label>
</form>
<script src="js/script.js"></script>






<jsp:include page="Include/Footer.jsp"/>