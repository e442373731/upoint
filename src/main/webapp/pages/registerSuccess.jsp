<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="container" style="text-align: center;margin-top: 10%">
    <img src="resources/img/1.jpg" />
    <div>
        <span>恭喜您注册成功，账号为<font color="blue">{{user.username}}</font></span><br>
        <span>{{count}}</span>秒后自动跳转到<a href="#login">登录</a>页面
    </div>
</div>