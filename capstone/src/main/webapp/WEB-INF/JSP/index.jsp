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
    <h2 style="text-align: center; color: black;">Our Wine Selection</h2>
    <div class="wine-list" style="display: flex; justify-content: center; gap: 20px; flex-wrap: wrap;">
        <div class="wine-card" style="text-align: center; border: 1px solid #ddd; padding: 20px; border-radius: 10px; background-color: white;">
            <img src="../../public/Images/Elegantred.png" alt="Red Wine " style="width: 100%; height: auto; border-radius: 10px;">
            <h3 style="color: black;">Finest Red Wine</h3>
            <p style="color: black;">A rich and robust red wine, perfect for any occasion.</p>
        </div>
        <div class="wine-card" style="text-align: center; border: 1px solid #ddd; padding: 20px; border-radius: 10px; background-color: white;">
            <img src="../../public/Images/WhiteWine.webp" alt="White Wine " style="width: 100%; height: auto; border-radius: 10px;">
            <h3 style="color: black;">Exclusive White Wine</h3>
            <p style="color: black;">A crisp and refreshing white wine, ideal for summer days.</p>
        </div>
        <div class="wine-card" style="text-align: center; border: 1px solid #ddd; padding: 20px; border-radius: 10px; background-color: white;">
            <img src="../../public/Images/RoseWine.png" alt="Rose Wine " style="width: 100%; height: auto; border-radius: 10px;">
            <h3 style="color: black;">Premium Rose Wine</h3>
            <p style="color: black;">A delightful rose wine, balancing sweetness and acidity.</p>
        </div>
        <!-- Add more wine cards as needed -->
    </div>
</main>


    <button  onclick={window.location.assign("http://localhost:8080/ProductCatalog")}>Shop All Wines</button>



<jsp:include page="Include/Footer.jsp"/>
