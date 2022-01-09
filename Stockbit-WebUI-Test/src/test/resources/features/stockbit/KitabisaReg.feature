@Web @Login @Test @KitaBisa
Feature: Login

  @Positive @Register
  Scenario: Register with phone number
    Given User is on kitabisa register page
    And User input username as "08981234589"
    And User input fullname as "anggastika"
    And User click button daftar
    Then User get alert "Kode verifikasi telah dikirim"

  @Negative @Register
  Scenario: Register with blank phone number
    Given User is on kitabisa register page
    And User input username as " "
    Then User get alert "Nomor ponsel atau email tidak boleh kosong."

  @Negative @Register
  Scenario: Register with 1 character phone number
    Given User is on kitabisa register page
    And User input username as "1"
    Then User get alert "Hanya diisi dengan nomor ponsel atau email yang valid."

  @Negative @Register
  Scenario: Register with blank fullname
    Given User is on kitabisa register page
    And User input fullname as " "
    Then User get alert fullname "Nama lengkap tidak boleh kosong."

  @Negative @Register
  Scenario: Register fullname with numeric
    Given User is on kitabisa register page
    And User input fullname as "1"
    Then User get alert fullname "Nama lengkap hanya boleh huruf, titik (.) dan apostrof (')."

  @Positive @FacebookAccount
  Scenario: Login with Facebook account
    Given User is on kitabisa register page
    When User click daftar dengan facebook
    When User changes to other window
    When User input facebook email "lucas.hemms4444@gmail.com"
    When User input facebook password "stockbit123"
    When User click facebook login button
    When User changes back to parent window
    Then User is on welcome page

    #Google doesn't allow bot authentication at the moment
  @Positive @GoogleAccount
  Scenario: Login with Google Account
    Given User is on kitabisa register page
    When User click daftar dengan google
    When User changes to other window
    When User input Google email "lucas.hemms4444@gmail.com"
    When User click Google next button
    When User input Google password "stockbit123"
    When User click Google next button
    When User changes back to parent window
    Then User is on welcome page

