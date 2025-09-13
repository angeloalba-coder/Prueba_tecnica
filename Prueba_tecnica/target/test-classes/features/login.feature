@Suite @Login
Feature: Prueba tecnica

  Background: Login y registro en portal Web

    Given el usuario navega al sitio web

    @DatosInvalidos
  Scenario: 1 - Login en portal web con usuario no existente
    When ingresa credenciales inexistentes
    Then deberia arrojar un mensaje de error Datos incorrectos, por favor intentelo nuevamente

      @RegistroNuevo
    Scenario: 2 - realizar un registro nuevo en el portal web
      When agrega sus datos para registrarse
      Then deberia ver un mensaje de registro exitoso


