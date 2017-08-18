<b>CustomLog</b>

This is a logger with a small, extensible API which provides utility on top of Android's normal Log class.

I make this class into all the little apps I make. I'm tired of doing it. Now it's a library.

Sometimes developer needs to delete or commment all logs before release build apk.

but using this library developer not need to delete or comment this logs.

<b> How to use this </b>

first you wnat add this in dependency. In app/build.gradle, add the following dependencies: 

  repositories {
  
        jcenter()
        
          ...
        
        maven { url "https://jitpack.io" }
   }
   
   dependencies 
   {
   
	        compile 'com.github.chandreshandroid:customlog:0.1'
          
	}
  
  
 after use simply this library like this
 
  customLog.d("TestLog","StartActivity"); 
  
  customLog.e("TestLog","StartActivity");
  
  customLog.v("TestLog","StartActivity");
  
  customLog.w("TestLog","StartActivity");
  
  
enjoy...   
  
   
   


