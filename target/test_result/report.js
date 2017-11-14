$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 87630543184,
  "status": "passed"
});
formatter.before({
  "duration": 275103,
  "status": "passed"
});
formatter.before({
  "duration": 156618,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Firstly login via email on Production",
  "description": "",
  "id": "login;firstly-login-via-email-on-production",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@P4"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "[WelcomePage] Enter Sign In screen",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "[SignInPage] Input Production Email \"rainy.chen11@gmail.com\" and Password \"Test!123\" and login",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "[NotificationPage] Login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "WelcomePage_steps.welcome_Page_Enter_Sign_In_Screen()"
});
formatter.result({
  "duration": 1077539745,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rainy.chen11@gmail.com",
      "offset": 37
    },
    {
      "val": "Test!123",
      "offset": 75
    }
  ],
  "location": "SignInPage_steps.signinpage_InputProductionEmailAndPasswordAndLogin(String,String)"
});
formatter.result({
  "duration": 28518053430,
  "status": "passed"
});
formatter.match({
  "location": "NotificationPage_steps.notification_pageLoginSuccessfully()"
});
formatter.result({
  "duration": 174102097,
  "status": "passed"
});
});