<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html data-ng-app="app">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎您</title>
<link href="resources/css/font-awesome.min.css" rel="stylesheet">
<link href="resources/css/login.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
</head>

<body ng-app="app">
	<div ng-view></div>
	<div ng-include="'pages/page_footer.html'"></div>
	
	<!-- Bootstarp -->
	<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<!-- AngularJS -->
	<script src="https://cdn.static.runoob.com/libs/angular.js/1.4.6/angular.min.js"></script>
	<script src="https://apps.bdimg.com/libs/angular-route/1.3.13/angular-route.js"></script>
	<script src="resources/lib/angular/angular-cookies.min.js"></script>
	<script src="resources/lib/angular/angular-resource.min.js"></script>
	
	<!-- App -->
	<script src="js/app.js"></script>
	<script src="js/common.js"></script>
	<script src="js/ctrl/loginCtrl.js"></script>
	<script src="js/ctrl/registerCtrl.js"></script>
	<script src="js/ctrl/rSuccessCtrl.js"></script>
</body>
</html>
