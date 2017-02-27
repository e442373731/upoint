'use strict';

var app = angular.module('app', [
	'ngRoute',
	'ngResource',
]);

app.config(['$routeProvider',function ($routeProvider) {
	$routeProvider.when('/login',{
		templateUrl:'pages/login.jsp',
		controller:'loginCtrl'
	})
	.when('/register',{
		templateUrl:'pages/register.jsp',
		controller:'registerCtrl'
	})
	/*.when('/home',{
		templateUrl:'dashboard/home.html',
		controller:'homeCtrl'
	})*/
	.otherwise({redirectTo:'/login'
	});
	
}]);

app.run(['$rootScope','$resource',function($rootScope,$resource){
	 $rootScope.user={};
}]);