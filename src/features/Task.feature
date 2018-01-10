Feature: Task

 @P1
 Scenario: Create a task from My task screen1
   Given User has logined glipapp
   When I tap Tasks icon on navigation bar
   When I tap Plus icon on title bar
   When I input title
   When I set Start Date
   When I set Due Date
   When I set Due Time
   When I save the task
   Then Save the task successfully