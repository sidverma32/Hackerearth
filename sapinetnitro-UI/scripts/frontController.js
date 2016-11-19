angular
		.module('angular-frontend')
		.controller('frontController', function($scope , frontFactory){

			$scope.hotel ;
			$scope.front;

			$scope.priceInfo = {
				min: 0,
				max: 5000
			}

			$scope.newListing = { };

			$scope.addFront = function(newListing) {
				newListing.image = 'hotel4';
				$scope.data.push(newListing);
			}

          frontFactory.getData().success(function(data){

            $scope.front=data;

          }).error(function(error){

            console.log(error);
          });
      	});