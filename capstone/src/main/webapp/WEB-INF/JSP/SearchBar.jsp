<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Include/Header.jsp"/>


<section>

    <div class="row">
        <div class="col col-12" style="height: 10vh"></div>
    </div>
    <div class="row justify-content-center text-center">
        <div class="col col-8">
            <form>
                <div>
                    <label for="name" class="form-label"><h4> Search </h4></label>
                    <input name="term" id="name" type="text" class="form-control" value="${term}" placeholder="Enter Search Term">
                </div>
                <button type="submit" class="btn btn-primary m-3">Search</button>
            </form>
        </div>
    </div>
</section>
<section>
    <div class="row justify-content-center">

        <table class="table table-striped table-warning col col-5" >
            <tr>
                <th>Product Id</th>

            </tr>

            <c:forEach items="${foundProducts}" var="product">

                <tr>
                    <td>${product.id}</td>

                </tr>

            </c:forEach>


        </table>

    </div>
</section>
<jsp:include page="Include/Footer.jsp"/>


