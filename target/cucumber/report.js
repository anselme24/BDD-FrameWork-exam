$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BDDFramework.feature");
formatter.feature({
  "line": 2,
  "name": "Changing BackGround of the ExamPage",
  "description": "",
  "id": "changing-background-of-the-exampage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@End2End"
    }
  ]
});
formatter.before({
  "duration": 6918120000,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Sky blue Back Ground",
  "description": "",
  "id": "changing-background-of-the-exampage;sky-blue-back-ground",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Sky Blue Backgroun Button Exist",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the Button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the backGround change to Blue",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDef.sky_Blue_Backgroun_Button_Exist()"
});
formatter.result({
  "duration": 80629600,
  "status": "passed"
});
formatter.match({
  "location": "StepsDef.i_click_on_the_Button()"
});
formatter.result({
  "duration": 103575900,
  "status": "passed"
});
formatter.match({
  "location": "StepsDef.the_backGround_change_to_Blue()"
});
formatter.result({
  "duration": 1088131500,
  "status": "passed"
});
formatter.before({
  "duration": 6079720100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "White BackGround Change",
  "description": "",
  "id": "changing-background-of-the-exampage;white-background-change",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "white BackGround Button Exists",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "The background will change to  white",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsDef.swhite_BackGround_Button_Exists()"
});
formatter.result({
  "duration": 27000,
  "status": "passed"
});
formatter.match({
  "location": "StepsDef.i_click_on_the_button()"
});
formatter.result({
  "duration": 63589100,
  "status": "passed"
});
formatter.match({
  "location": "StepsDef.the_background_will_change_to_white()"
});
formatter.result({
  "duration": 1191493600,
  "status": "passed"
});
});