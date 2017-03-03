app.controller('rSuccessCtrl', ['$rootScope', '$scope', '$resource', '$location', function($rootScope, $scope, $resource, $location){
	$scope.user.username = $rootScope.user.username;
}]);