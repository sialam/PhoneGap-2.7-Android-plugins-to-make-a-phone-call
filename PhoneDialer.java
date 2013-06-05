package org.apache.cordova;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import android.net.Uri;

import android.content.Intent;

public class PhoneDialer extends CordovaPlugin {
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException{	   
		if ("call".equals(action)) {
			try{	        	 
	            Uri number = Uri.parse("tel:" + args.getString(0));
	            Intent callIntent = new Intent(Intent.ACTION_CALL, number); 
	            this.cordova.getActivity().startActivity(callIntent);
	        } catch (Exception e) {

			}      
	        callbackContext.success();
			return true;
	    }
		return false;	    
	}
}
