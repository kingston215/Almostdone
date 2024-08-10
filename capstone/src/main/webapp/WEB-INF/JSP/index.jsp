<jsp:include page="Include/Header.jsp"/>
<link rel="stylesheet" href="../../public/CSS/style.css">

<h2 style="text-align: center">Welcome to Whine4me Winery</h2>
<p id="tagline" style="text-align: center; color: yellow;" ><em>Pour Perfection in Every Glass</em></p>
<div class="myVideoContainer">
<video autoplay muted loop id="myVideo">
    <source src="../../public/Videos/Whineglass.mp4" type="video/mp4">
</video>
</div>

<main>
    <h2 style="text-align: center">Our Wine Selection</h2>
    <div class="wine-list">
        <div class="wine-card">
            <img src="../../public/Images/Elegantred.png" alt="Red Wine ">
            <h3 style="text-align: center">Finest Red Wine</h3>
            <p>A rich and robust red wine, perfect for any occasion.</p>
        </div>
        <div class="wine-card">
            <img src="../../public/Images/WhiteWine.webp" alt="White Wine ">
            <h3 style="text-align: center">Exclusive White Wine</h3>
            <p>A crisp and refreshing white wine, ideal for summer days.</p>
        </div>
        <div class="wine-card">
            <img src="../../public/Images/RoseWine.png" alt="Rose Wine ">
            <h3 style="text-align: center">Premium Rose Wine</h3>
            <p>A delightful rose wine, balancing sweetness and acidity.</p>
        </div>
        <!-- Add more wine cards as needed -->
    </div>
</main>


    <button  onclick={window.location.assign("http://localhost:8080/ProductCatalog")}>Shop All Wines</button>



<jsp:include page="Include/Footer.jsp"/>
