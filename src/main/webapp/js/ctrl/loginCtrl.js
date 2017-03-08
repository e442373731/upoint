app.controller('loginCtrl', ['$rootScope', '$scope', '$resource', '$location', '$interval', function($rootScope, $scope, $resource, $location, $interval){
	//从注册界面过来
	$scope.user.username = $rootScope.user.username;
	
	$interval(function() {
		$scope.theTime = new Date().toLocaleTimeString();
	}, 1000);
	
	$scope.login = function() {
		var loginResource = $resource('user/login', {}, {login:{method:'POST'}});
		
		loginResource.login({}, $scope.user, function(res){
			if(res.data == true){
				alert("login success!");
				if($scope.remeberMe == true){
					setCookie($scope.user.username, $scope.user.password, 1);
				}
			} else {
				alert("login failed!!");
			}
		}, function(res){
			alert("Server error!");
		});
	};
	
	$scope.remeberPw = function(){
		var name = $scope.user.username;
		if(name != undefined){
			$scope.user.password = getCookie(name);
		}
	}
	
}]);