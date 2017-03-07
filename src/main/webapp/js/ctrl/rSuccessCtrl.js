app.controller('rSuccessCtrl', [ '$rootScope', '$scope', '$resource',
		'$location', '$interval', function($rootScope, $scope, $resource, $location, $interval) {
			
			$scope.count = 5;
			$scope.user.username = $rootScope.user.username;
			
			//实现读秒跳转，$timeout服务有类似功能
			$interval(function(){
				if(--$scope.count == 0){
					$location.path("/login");
				}
			}, 1000, 5);
			
		} ]);
