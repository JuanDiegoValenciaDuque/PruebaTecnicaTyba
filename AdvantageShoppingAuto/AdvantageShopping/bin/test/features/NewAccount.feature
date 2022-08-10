@tag
Feature: Crear cuenta
  El usuario desea crear un nueva cuenta

  @tag1
  Scenario Outline: Crear cuenta
    Given Desea crear cuenta
    When ingresa al formulario de creacion
    And diligencia el formulario con los valores <userName> <email> <password> <confirmPassword>
    Then Valida que el usuario <userName> esta logueado correctamente

    Examples: 
      | userName       | email                   | password | confirmPassword |
      | JuanDValencia4 | JuanDValencia@email.com | Ab1234   | Ab1234          |
