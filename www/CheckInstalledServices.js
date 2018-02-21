var exec = require('cordova/exec');

var CheckInstalledServices = {
check: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "CheckInstalledServices", "check", []);
    }
};

module.exports = CheckInstalledServices;