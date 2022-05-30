Feature: Acciones en Wikipedia
  Realizar diferentes acciones en la pagina de wikipedia

  Scenario: Buscar software testing desde la pantalla Home
    Given El usuario se encuentra en la pagina Home de Wikipedia
    And Cambia el idioma a Ingles
    And Entra en el primer articulo de 'On this days'
    When Realiza una busqueda de software testing y hace click en el buscador
    Then Se debe redirigir a la pantalla de software testing
    And Vuelve a redirigirse a la pagina Home