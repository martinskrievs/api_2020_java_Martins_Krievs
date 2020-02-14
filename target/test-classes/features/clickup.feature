Feature: Clickup board
  This is very explaining description

  Scenario: Update Board name
    When  User creates new folder in Clickup with id "2493404"
    And Then he check is folder is created
    Then Delete folder that has been created

  @CreatNewFolder
  Scenario: Add folder and list in Clickup
    When User creates new folder in Clickup with id "2572551" and name "Helo"
    And User creates a lsit with a name of "List name"
    Then User verifys that lsit has been made


  @CreatNewFolder
  @ClickUPNameChanged
  Scenario: Update space name
    When User updates Clickup with id "2572551" and name of it "New king"
    Then User check if folder has been made "New king"
    And And creates a task "nee"
    Then User check if every thing has been changed

