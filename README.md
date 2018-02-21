# cordova-check-installed-services

Simple plugin that checks if a service is installed. Currently only check if Google Play Services is installed.

## Using

In your cordova project folder:

    $ cordova plugin add https://github.com/gongfan99/cordova-plugin-check-installed-services.git


Then the variable 'CheckInstalledServices' will be available after `deviceready` fires.

```js
	document.addEventListener('deviceready', function () {
	
		var success = function(message) {
			alert("GooglePlayServiceInstalled? " + message.isGooglePlayServicesAvailable.toString());
		} // message.isGooglePlayServicesAvailable is a boolean value

		var failure = function(message) {
			alert(JSON.stringify(message));
		}

		CheckInstalledServices.check(success, failure);
	})
```


