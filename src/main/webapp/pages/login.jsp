<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div class="container">
		<form class="form-signin box-shadow-8" role="form" name="myForm" 
			style="margin-top: 100px">
		
			<div class="form-group">
				<h3 class="form-signin-heading" style="text-align: center">
					欢迎登陆 <span style="font-size: small">{{theTime}}</span>
				</h3>
			</div>

			<div class="form-group">
				<i class="fa fa-user fa-lg"></i>
				<input type="text" class="form-control" placeholder="请输入账户名" ng-model="user.username" ng-blur="remeberPw()" required autofocus>
				
				<i class="fa fa-lock fa-lg"></i>
				<input type="password" class="form-control" placeholder="请输入密码" ng-model="user.password" required>
			</div>

			<div class="form-group">
				<input type="checkbox" value="remember-me" ng-model="remeberMe" style="font-size: 13px;"> <span class="text" style="font-size: 13px;color: #7B7B7B;">记住密码</span>
				<a href="/upoint/register.jsp" style="font-size: 13px;float: right;margin-top:5px">忘记密码？</a>
			</div>

			<div class="form-group">
				<button class="btn btn-primary btn-block" type="submit" style="margin-top: 15px" ng-click="login()" ng-disabled='myForm.$invalid'>登陆</button>
				<a href="#register" class="btn btn-default btn-block">注册</a>
			</div>
		</form>
		
	</div>