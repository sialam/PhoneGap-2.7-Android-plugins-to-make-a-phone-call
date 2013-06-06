PhoneGap-2.7-Android-plugins-to-make-a-phone-call
==================================================

1. Create a new package org.apache.cordova under src folder, if already exist with same name use that one.
2. Copy PhoneDialer.java to this package.
3. Copy PhoneDialer.js file in your www/js directory
4. Crete a reference for this .js file to your index.html file
5. Put this line <pre> <plugin name="PhoneDialer" value="org.apache.cordova.PhoneDialer"/></pre> in config.xml file
6. Modify AndroidManifest.xml file and put <uses-permission android:name="android.permission.CALL_PHONE" /> in 
user-permission section. In activity section place these lines- 
'<intent-filter>
      <action android:name="android.intent.action.CALL" />	             	             		        		        
		  <data android:scheme="tel" />
</intent-filter>'


Thats it. Happy coding....
