Feature: The Internet
  This feature covers (some) Example pages on 'the-internet.herokuapp.com'

  Background:
    Given the page under test is 'https://the-internet.herokuapp.com'

  @TEST_TI_0001
  Scenario: Homepage has a list of links to expected examples
    When I navigate to the homepage
    Then I should see a list of expected examples
    And the following links should be present:
      | Add/Remove Elements  |
      | Basic Auth           |
      | Broken Images        |
      | Challenging DOM      |
      | Context Menu         |
      | Digest Authentication|
      | Disappearing Elements|
      | Drag and Drop        |
      | Dropdown             |
      | Dynamic Content      |
      | Dynamic Controls     |
      | Dynamic Loading      |
      | Entry Ad             |
      | Exit Intent          |
      | File Download        |
      | File Upload          |
      | Floating Menu        |
      | Forgot Password      |
      | Form Authentication  |
      | Geolocation          |
      | Horizontal Slider    |
      | Infinite Scroll      |
      | Inputs               |
      | JavaScript Alerts    |
      | JavaScript onload event error |
      | Key Presses          |
      | Large & Deep DOM     |
      | Multiple Windows     |
      | Nested Frames        |
      | Notification Messages|
      | Redirect Link        |
      | Secure File Download |
      | Shadow DOM           |
      | Shifting Content     |
      | Slow Resources       |
      | Sortable Data Tables |
      | Status Codes         |
      | Typos                |
      | WYSIWYG Editor       |

  @TEST_TI_0002
  Scenario: Basic Auth allows validated access
    When the 'Basic Auth' example is opened
    And I enter username "admin" and password "admin"
    Then I should see the message "Congratulations!"

  @TEST_TI_0003
  Scenario: Sortable Data Tables - Example 1 displays the expected 4 results
    When I navigate to the 'Sortable Data Tables' example
    Then I should see the table with the following results:
      | Last Name | First Name | Email                 | Due    | Web Site                   |
      | Smith     | John       | jsmith@gmail.com      | $50.00 | http://www.jsmith.com      |
      | Bach      | Frank      | fbach@yahoo.com       | $51.00 | http://www.frank.com       |
      | Doe       | Jason      | jdoe@hotmail.com      | $100.00| http://www.jdoe.com        |
      | Conway    | Tim        | tconway@earthlink.net | $50.00 | http://www.timconway.com   |
