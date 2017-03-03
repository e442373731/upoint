app.controller('loginCtrl', ['$rootScope', '$scope', '$resource', '$location', '$interval', function($rootScope, $scope, $resource, $location, $interval){
	$scope.user.username = $rootScope.user.username;
	
	$interval(function() {
		$scope.theTime = new Date().toLocaleTimeString();
	}, 1000);
}]);