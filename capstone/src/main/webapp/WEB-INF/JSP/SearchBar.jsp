<jsp:include page="Include/Header.jsp"/>
<section>
    <div class="row">
        <div class="col col-12" style="height: 10vh"></div>
    </div>
    <div class="row justify-content-center text-center">
        <div class="col col-8">
            <form>
                <div>
                    <label for="name" class="form-label"><h4>Admin Search Tool</h4></label>
                    <input name="term" id="name" type="text" class="form-control" value="${term}" placeholder="Enter Search Term">
                </div>
                <button type="submit" class="btn btn-primary m-3">Search</button>
            </form>
        </div>
    </div>
</section>

<jsp:include page="Include/Footer.jsp"/>


