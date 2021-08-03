<%--
  Created by IntelliJ IDEA.
  User: pradip
  Date: 04/06/2021
  Time: 16:42
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta content="" name="description" />
    <meta content="pradip bhandari" name="author" />
    <title>Tweetsky</title>
    <meta name="layout" content="tweetsky" />

</head>

<body>
<div id="wrapper">
    <g:render template="navbar" model="[:]"/>
    <g:render template="side" model="[:]"/>



    <div id="page-wrapper">
        <div class="content-wrapper">
            <div class="row">
                <g:render template="tweets" model="[:]"/>
                <g:render template="tweetsoptions" model="[:]"/>


            </div>
        </div>
        <!-- content-wrapper -->
    </div>
    <!-- /. PAGE WRAPPER  -->
</div>
<!-- /. WRAPPER  -->






</body>

</html>
