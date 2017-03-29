'use strict';

/* Controllers */
  // signin controller
app.controller('SigninFormController', ['$scope', '$http', '$state', function($scope, $http, $state) {
    $scope.user = {};
    $scope.authError = null;
    $scope.login = function() {
       // console.log("8888");



        var oficinaSucursal = {
        };
        oficinaSucursal.oficina="001";
        oficinaSucursal.nombre="002";
        oficinaSucursal.sucursal="003";
        oficinaSucursal.sucursalNombre="005";

          UsuarioPerfil.obtenerOficinasSucursales( oficinaSucursal ,callbackObtenerOficinasSucursales);

          $state.go('app.dashboard-v2');

    };

    var callbackObtenerOficinasSucursales = function (data) {
        console.log(data);
    }
  }])
;