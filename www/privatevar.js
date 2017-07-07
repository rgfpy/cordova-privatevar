cordova.define("com-sistepar-cordova-privatevar", function(require, exports, module) {
var exec = require('cordova/exec');
var platform = require('cordova/platform');
	
module.exports = {
	get: function (parmPost, successCallback, errorCallback) {
		exec(successCallback, errorCallback, "PrivatevarPlugin", "get", [parmPost]);
	}
};

});