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
	        implementation 'com.github.techseya:SupportMe:1.0.0'
	}
  ```
  ### Usage 
 
  >Popup window with buttons
  ```java
  NetworkDetector.Detector(this,"Searching for Network","Network connection not found...");
  ```
  >Progress dialog with animation
  ```java
  NetworkDetector.ProgressDetector(this,MainActivity.this,"Searching for network","Network connection not found...");
  ```
  # Preview
 
  <img src="app/src/main/res/drawable/image2.gif" width="400" >
  <img src="app/src/main/res/drawable/image.gif" width="400" >
  
   
  
  _Intellectual property of ©Techseya 2022_
