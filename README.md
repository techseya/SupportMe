# SupportMe
**_In-App social media promotion integration_**

 ### Setup
>Step 1. Add the JitPack repository to your build file
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  >Step 2. Add the dependency
  ```gradle
  dependencies {
	        implementation 'com.github.techseya:NetworkDetector:0.0.1'
	}
  ```
  ### Usage 
 
  >For YouTube Subscription
  ```java
          SupportMe.ClickDialog(MainActivity.this,4,"Subscribe Me","Subscribe my You Tube channel","https://www.youtube.com/c/Techseya");
	  


  ```
  >For Rating app in Google Play
  ```java
          SupportMe.ClickDialog(MainActivity,4,"Rate App","If you are satifieid,please rate our app","https://rb.gy/9msah2");
	 
	  


  ```
  >For Joining Telegram
  ```java
	  SupportMe.ClickDialog(MainActivity,4,"Join our Telegram","Click to join our Telegram group","https://t.me/techseya");
	  


  ```
  # Preview
 
  <img src="app/src/main/res/drawable/image2.gif" width="400" >
  <img src="app/src/main/res/drawable/image.gif" width="400" >
  
   
  
  _Intellectual property of ©Techseya 2022_
