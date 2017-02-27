app.controller('registerCtrl', ['$rootScope', '$scope', '$resource', '$location', '$interval', function($rootScope, $scope, $resource, $location, $interval){
	
	$scope.validUsername = true;
	
	$scope.validPassword = true;
	
	$interval(function() {
		$scope.theTime = new Date().toLocaleTimeString();
	}, 1000);
	
	$scope.validatePassword = function() {
		var pass1 = $scope.password;
		var pass2 = $scope.password2;
		
		if(pass1 == pass2){
			$scope.validPassword = true;
		} else {
			$scope.validPassword = false;
			$scope.password2 = '';
		}
	};
}]);