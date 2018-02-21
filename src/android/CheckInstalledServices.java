package com.example.plugin;

import org.apache.cordova.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class CheckInstalledServices extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
		/* ConnectionResult can have following states:
			SUCCESS, SERVICE_MISSING, SERVICE_UPDATING, SERVICE_VERSION_UPDATE_REQUIRED, SERVICE_DISABLED, SERVICE_INVALID
		*/
        if (action.equals("check")) {
			JSONObject jo = new JSONObject();
			int val = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.cordova.getActivity().getApplicationContext());
			callbackContext.success(jo.put("isGooglePlayServicesAvailable",  val == ConnectionResult.SUCCESS || val == ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED));

            return true;

        } else {
            
            return false;

        }
    }
}
