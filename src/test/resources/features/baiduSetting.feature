@setting
Feature: 百度搜索

Scenario:
	Given navigate to baidu "https://www.baidu.com" homePage
	When action on setting
	Then click on searchSetting
	Then click on saveSetting
	And alert should have "已经记录下您的使用偏好" expectedAlertText
	Then choose to accept alert
	