$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 247636761932,
  "status": "passed"
});
formatter.before({
  "duration": 149286,
  "status": "passed"
});
formatter.before({
  "duration": 93404,
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
  "duration": 5860310956,
  "error_message": "java.lang.ClassCastException: org.openqa.selenium.remote.RemoteWebElement cannot be cast to io.appium.java_client.MobileElement\n\tat Tools.Helper.findByAccessibilityId(Helper.java:41)\n\tat Screens.WelcomePage.SignIntoGlipButton(WelcomePage.java:20)\n\tat Screens.WelcomePage.EnterSignIntoScreen(WelcomePage.java:25)\n\tat Steps.WelcomePage_steps.welcome_Page_Enter_Sign_In_Screen(WelcomePage_steps.java:32)\n\tat ✽.Given [WelcomePage] Enter Sign In screen(features/Login.feature:18)\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "NotificationPage_steps.notification_pageLoginSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
});