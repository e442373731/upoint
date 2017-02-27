app.controller('loginCtrl', ['$rootScope', '$scope', '$resource', '$location', '$interval', function($rootScope, $scope, $resource, $location, $interval){
	$interval(function() {
		$scope.theTime = new Date().toLocaleTimeString();
	}, 1000);
}]);