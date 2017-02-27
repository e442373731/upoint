app.controller('registerCtrl', ['$rootScope', '$scope', '$resource', '$location', '$interval', function($rootScope, $scope, $resource, $location, $interval){
	
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
	
	$scope.register = function() {
		var registerUser = $resource('user/register.do', {}, {add:{method:'POST',responseType:"application/json;charset=UTF-8"}});
		registerUser.save({}, $scope.user, function(res){
			alert("signup success");
			var user = res.data;
            $rootScope.user.name = user.name;
			$location.path("/login");
		}, function (error) {
			alert("signup faliure");
		});
	};
	
}]);