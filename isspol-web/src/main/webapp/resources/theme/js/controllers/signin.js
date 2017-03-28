'use strict';

/* Controllers */
  // signin controller
app.controller('SigninFormController', ['$scope', '$http', '$state', function($scope, $http, $state) {
    $scope.user = {};
    $scope.authError = null;
    $scope.login = function() {
       // console.log("8888");
          UsuarioPerfil.obtenerOficinasSucursales().callback(function (data) {
              console.log(data);
          },function (error) {
              console.log(error);
          });

          $state.go('app.dashboard-v2');

    };
  }])
;