@screen
  Feature: As logged in user I cand change my password

    Scenario: Change password successfully
      Given I successfully login
      When I click on Preferences button
      And I input current password
      And I input new password
      And I confirm the new password
      And I click on Save button
      Then I should see "Your password has been successfully changed" message
      And I close Prefereces window
      And I can re-login with the new credentials