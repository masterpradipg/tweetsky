<nav class="navbar navbar-default top-navbar" role="navigation">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>


        <div id="sideNav" href="">
            <i class="fa fa-bars icon"></i>
        </div>
        <a class="navbar-brand" href=""><strong>Twitter App</strong></a>
    </div>

    <ul class="nav navbar-top-links navbar-right">
        <li class="logBtn">


            <sec:ifNotLoggedIn>
                <g:render template="/auth/loginWithTwitter"/>
            </sec:ifNotLoggedIn>
            <sec:ifLoggedIn>
                <g:form controller="logout" style="display: inline;">
                    <input type="submit" value="${g.message(code: "logout", default:"Logout")}"/>
                </g:form>
            </sec:ifLoggedIn>
        </li>
    </ul>
</nav>
