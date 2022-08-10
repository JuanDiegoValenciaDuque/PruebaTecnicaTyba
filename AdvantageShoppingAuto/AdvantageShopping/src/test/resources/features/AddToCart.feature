@tag
Feature: Agregar productos
  El usuario desea agregar productos al carrito

  @tag1
  Scenario Outline: Agregar productos
    Given Desea agregar productos al carrito
    When Busca el producto <producto> a agregar
    And Agrega el <index> producto <cantidad> veces
    Then Valida que el producto fue agregado correctamente
    And Verifica la cantidad agregada
    And Verifica el valor calculado

    Examples: 
      | producto | index | cantidad |
      | HP       | "1"   |        4 |
