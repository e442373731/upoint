<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div class="container">
		<form class="form-signin box-shadow-8" role="form" name="myForm" style="margin-top: 100px">
			<div class="form-group">
				<h3 class="form-signin-heading" style="text-align: center">
					欢迎注册 <span style="font-size: small">{{theTime}}</span>
				</h3>
			</div>
			
			<div class="form-group" style="margin-bottom: 0px;">
				<i class="fa fa-user fa-lg"></i> 
				<input type="text" class="form-control" ng-model="user.username" name="username" ng-minlength="6"
						placeholder="请输入账户名" ng-blur="validateUsername()" required autofocus>
			</div>
			
			<div class="form-group">
					
				<i class="fa fa-lock fa-lg"></i> 
				<input type="password" class="form-control" ng-model="user.password" name="password" ng-minlength="8"
						placeholder="请输入密码" ng-disabled="myForm.username.$invalid || !validUsername" required>
						
				<i class="fa fa-check fa-lg"></i> 
				<input type="password" class="form-control" ng-model="user.password2" name="password2"
						placeholder="请再次输入密码" ng-disabled="myForm.username.$invalid || myForm.password.$invalid" ng-blur="validatePassword()" required>
				
				<div class="tip" style="margin-top:5px"
						ng-show="myForm.username.$error.minlength"><span class="text" style="font-size: 13px;color: red;">账号最少6位</div>
				<div class="tip" style="margin-top:5px"
						ng-show="myForm.password.$error.minlength"><span class="text" style="font-size: 13px;color: red;">密码最少8位</div>
				<div class="tip" style="margin-top:5px"
						ng-show="!validPassword"><span class="text" style="font-size: 13px;color: red;">两次输入的密码不一致</div>
				<div class="tip" style="margin-top:5px"
						ng-show="!validUsername"><span class="text" style="font-size: 13px;color: red;">用户名已存在</div>
			</div>
			
			<div class="form-group">
				<input name="remeberMe" ng-model="remeberMe" type="checkbox" required> <span class="text" style="font-size: 13px;color: #7B7B7B;">已阅读用户协议</span>
			</div>
			
			<div class="form-group">
				<button type="submit" class="btn btn-block btn-primary" ng-disabled='myForm.$invalid||!validUsername||remeberMe!=true||
					!validPassword||password != password2'
					id="register_btn" ng-click="register()">注册</button>
				<a href="#login" class="btn btn-default btn-block">登陆</a>
			</div>
		</form>
	</div>
