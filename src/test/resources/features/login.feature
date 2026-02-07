@login
Feature: Login

  Scenario: Login com sucesso
    Given que estou na tela de login
    When informo usuario e senha validos
    Then o login deve ser realizado
