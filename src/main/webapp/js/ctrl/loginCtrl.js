app.controller('loginCtrl', ['$rootScope', '$scope', '$resource', '$location', '$interval', function($rootScope, $scope, $resource, $location, $interval){
	$scope.user.username = $rootScope.user.username;
	
	$interval(function() {
		$scope.theTime = new Date().toLocaleTimeString();
	}, 1000);
	
	$scope.login = function() {
		if($scope.user.name == '' || $scope.user.password == '')
			return '';
		
		var loginResource = $resource('user/login', {}, {login:{method:'POST'}});
		
		loginResource.login({}, $scope.user, function(res){
			if(res.data == true){
				alert("login success!");
			} else {
				alert("login failed!!");
			}
		}, function(res){
			alert("Server error!");
		});
	};
}]);