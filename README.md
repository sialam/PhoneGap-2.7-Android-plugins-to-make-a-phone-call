PhoneGap-2.7-Android-plugins-to-make-a-phone-call
==================================================

1. Create a new package org.apache.cordova under src folder, if already exist with same name use that one.
2. Copy PhoneDialer.java to this package.
3. Copy PhoneDialer.js file in your www/js directory
4. Crete a reference for this .js file to your index.html file
5. Put this line <pre> &lt;plugin name="PhoneDialer" value="org.apache.cordova.PhoneDialer"/&gt;</pre> in config.xml file
6. Modify AndroidManifest.xml file and put <pre> &lt;uses-permission android:name="android.permission.CALL_PHONE" /&gt;</pre> in 
user-permission section. In activity section place these lines- 
<pre>&lt;intent-filter&gt;
      &lt;action android:name="android.intent.action.CALL" /&gt;	             	             		        		        
		 &lt;data android:scheme="tel" /&gt;
&lt;/intent-filter&gt;</pre>


Thats it. Happy coding....
