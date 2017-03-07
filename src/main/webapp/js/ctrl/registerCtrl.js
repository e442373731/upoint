app.controller('registerCtrl', ['$rootScope', '$scope', '$resource', '$location', '$interval', function($rootScope, $scope, $resource, $location, $interval){
	$scope.user.username = "";
	$scope.user.password = "";
	$scope.user.password2 = "";
	
	$scope.validUsername = true;
	
	$scope.validPassword = true;
	
	$interval(function() {
		$scope.theTime = new Date().toLocaleTimeString();
	}, 1000);
	
	$scope.validatePassword = function() {
		var pass1 = $scope.user.password;
		var pass2 = $scope.user.password2;
		
		if(pass1 == pass2){
			$scope.validPassword = true;
		} else {
			$scope.validPassword = false;
			$scope.user.password2 = '';
		}
	};
	
	$scope.validateUsername = function() {
		var userResource = $resource('user/:username',{username:$scope.user.username},{query:{method:'get',isArray:false}});
		if($scope.user.username != undefined){
			if($scope.user.username.indexOf(".") > 0){
				$scope.validUsername = false;
			} else {
				userResource.query({username:$scope.user.username},function(res){
					if(res.data != null){
						$scope.validUsername = false;
					}else{
						$scope.validUsername = true;
					}
				});
			}
			
		}else{
			$scope.validUsername = true;
		}
	};
	
	$scope.register = function() {
		var registerUser = $resource('user/register', {}, {add:{method:'POST',responseType:"application/json;charset=UTF-8"}});
		registerUser.save({}, $scope.user, function(res){
			alert("signup success");
			var user = res.data;
			$location.path("/registerSuccess");
		}, function (error) {
			alert("signup faliure");
		});
	};
	
}]);