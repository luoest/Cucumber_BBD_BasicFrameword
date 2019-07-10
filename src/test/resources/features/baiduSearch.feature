@searching
Feature: 百度搜索

Scenario Outline:
	Given navigate to baidu "https://www.baidu.com" homepage
	Then clear searchBox
	And enter searchBox with "<keyword>" keyword
	And click submit button to perform search
	Then page title shold be "<expectedPageTitle>" expected
	Then click target link with "<partialKeyWord>" partialLinkText
	
Examples:
	|keyword |expectedPageTitle|partialKeyWord|
	|selenium|selenium_百度搜索      |Web Browser Automation|
	|python  |python_百度搜索           |Welcome to Python.org|