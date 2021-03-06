$(document).ready(function(){
  $("p.invalid").hide();
});

$(document).ready(function(){
  var nVer = navigator.appVersion;
  var nAgt = navigator.userAgent;
  var browserName  = navigator.appName;
  var fullVersion  = ''+parseFloat(navigator.appVersion); 
  var majorVersion = parseInt(navigator.appVersion,10);
  var nameOffset,verOffset,ix;

// In Opera, the true version is after "Opera" or after "Version"
if ((verOffset=nAgt.indexOf("Opera"))!=-1) {
  browserName = "Opera";
  fullVersion = nAgt.substring(verOffset+6);
  if ((verOffset=nAgt.indexOf("Version"))!=-1) 
    fullVersion = nAgt.substring(verOffset+8);
}
// In MSIE, the true version is after "MSIE" in userAgent
else if ((verOffset=nAgt.indexOf("MSIE"))!=-1) {
  browserName = "Microsoft Internet Explorer";
  fullVersion = nAgt.substring(verOffset+5);
}
// In Chrome, the true version is after "Chrome" 
else if ((verOffset=nAgt.indexOf("Chrome"))!=-1) {
  browserName = "Chrome";
  fullVersion = nAgt.substring(verOffset+7);
}
// In Safari, the true version is after "Safari" or after "Version" 
else if ((verOffset=nAgt.indexOf("Safari"))!=-1) {
  browserName = "Safari";
  fullVersion = nAgt.substring(verOffset+7);
  if ((verOffset=nAgt.indexOf("Version"))!=-1) 
    fullVersion = nAgt.substring(verOffset+8);
}
// In Firefox, the true version is after "Firefox" 
else if ((verOffset=nAgt.indexOf("Firefox"))!=-1) {
  browserName = "Firefox";
  fullVersion = nAgt.substring(verOffset+8);
}
// In most other browsers, "name/version" is at the end of userAgent 
else if ( (nameOffset=nAgt.lastIndexOf(' ')+1) < 
  (verOffset=nAgt.lastIndexOf('/')) ) 
{
  browserName = nAgt.substring(nameOffset,verOffset);
  fullVersion = nAgt.substring(verOffset+1);
  if (browserName.toLowerCase()==browserName.toUpperCase()) {
    browserName = navigator.appName;
  }
}
// trim the fullVersion string at semicolon/space if present
if ((ix=fullVersion.indexOf(";"))!=-1)
fullVersion=fullVersion.substring(0,ix);
if ((ix=fullVersion.indexOf(" "))!=-1)
  fullVersion=fullVersion.substring(0,ix);

majorVersion = parseInt(''+fullVersion,10);
if (isNaN(majorVersion)) {
  fullVersion  = ''+parseFloat(navigator.appVersion); 
  majorVersion = parseInt(navigator.appVersion,10);
}

// Add the browser name to the element id browserName
document.getElementById("browserName").innerHTML = browserName;
});

// Progress bar
$(document).ready(function(){
  // Hide setting_wrapper
  $("#progress").hide();

  // Toggle dashboard
  $("#submissionSubmit").click(function(){
    if(document.getElementById("compositions").value.length != 0) { 
      $("progress").show();
      function progress() {
        var val = progressbar.progressbar( "value" ) || 0;

        progressbar.progressbar( "value", val + 2 );

        if ( val < 99 ) {
          setTimeout( progress, 80 );
        }
      }
    }
  });
});

// Dashboard toggle
$(document).ready(function(){
  // Hide setting_wrapper
  $("#setting_wrapper").hide();

  // Toggle dashboard
  $("#dashboard").click(function(){
    $("#dashboard").toggleClass("down");
    $("#setting_wrapper").toggle("down");
  });
});

// Redirect url to add destination
function addDest() {
  window.location.assign("http://" + location.host + "/destination")
};

// Redirect url to submission
function submission() {
  window.location.assign("http://" + location.host + "/submission")
};

// Redirect back to home screen after logout
$(document).ready(function(){
  if(location.href == ("http://" + location.host + "/logout")) {
    window.setTimeout(function() {
      window.location.href = "http://" + location.host
    }, 4000);
  }
});

// Redirect account update back to submission
$(document).ready(function(){
  if(location.pathname.match(/\/update\/(.*)\/updated/)) {
    window.setTimeout(function() {
      window.location.href = "http://" + location.host + "/submission"
    }, 5000);
  }  
});

// Redirect updated destination back to submission
$(document).ready(function(){
  if(location.pathname.match(/\/updateDest\/(.*)\/updated/)) {
    window.setTimeout(function() {
      window.location.href = "http://" + location.host + "/submission"
    }, 5000);
  }  
});

// Redirect deleted destination to submission
$(document).ready(function(){
  if(location.pathname.match(/\/updateDest\/(.*)\/deleted/)) {
    window.setTimeout(function() {
      window.location.href = "http://" + location.host + "/submission"
    }, 5000);
  }  
});

// Hide hint
$(document).ready(function(){
  $("#typeHint").hide();
});

// Change destination type
function changeDestinationType() {
  if (document.getElementById("newDestinationType").value == "Cluster") {
    document.getElementById("newDestinationType").value = "DAGMan";
  }
  else if (document.getElementById("newDestinationType").value == "DAGMan") {
    document.getElementById("newDestinationType").value = "Cluster";
  }
}

// Function to show type hint
function showTypeHint() {
  $("#typeHint").show();
}

// Function to hide type hint
function hideTypeHint() {
  $("#typeHint").hide();
}