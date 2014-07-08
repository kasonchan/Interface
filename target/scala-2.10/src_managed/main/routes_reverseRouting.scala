// @SOURCE:/home/ka-son/Documents/Interface/conf/routes
// @HASH:27589cac39641417900b7a5cfcb0cd28f264fefe
// @DATE:Tue Jul 08 18:00:21 CDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:24
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:11
class ReverseFiles {
    

// @LINE:11
def upload(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "guest")
}
                                                
    
}
                          

// @LINE:26
// @LINE:24
// @LINE:21
// @LINE:19
class ReverseUsers {
    

// @LINE:21
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:19
def signup(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:24
def listUser(username:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "update/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
}
                                                

// @LINE:26
def update(username:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "update/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
}
                                                
    
}
                          

// @LINE:32
class ReverseAssets {
    

// @LINE:32
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:29
// @LINE:17
// @LINE:14
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:29
def destination(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "destination")
}
                                                

// @LINE:17
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:14
def test(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                                                

// @LINE:9
def guest(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "guest")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:24
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:11
class ReverseFiles {
    

// @LINE:11
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Files.upload",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "guest"})
      }
   """
)
                        
    
}
              

// @LINE:26
// @LINE:24
// @LINE:21
// @LINE:19
class ReverseUsers {
    

// @LINE:21
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:19
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.signup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:24
def listUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.listUser",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
      }
   """
)
                        

// @LINE:26
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.update",
   """
      function(username) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
      }
   """
)
                        
    
}
              

// @LINE:32
class ReverseAssets {
    

// @LINE:32
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:29
// @LINE:17
// @LINE:14
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:29
def destination : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.destination",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "destination"})
      }
   """
)
                        

// @LINE:17
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:14
def test : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.test",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
   """
)
                        

// @LINE:9
def guest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.guest",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "guest"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:32
// @LINE:29
// @LINE:26
// @LINE:24
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:11
class ReverseFiles {
    

// @LINE:11
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Files.upload(), HandlerDef(this, "controllers.Files", "upload", Seq(), "POST", """""", _prefix + """guest""")
)
                      
    
}
                          

// @LINE:26
// @LINE:24
// @LINE:21
// @LINE:19
class ReverseUsers {
    

// @LINE:21
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.list(), HandlerDef(this, "controllers.Users", "list", Seq(), "GET", """""", _prefix + """users""")
)
                      

// @LINE:19
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.signup(), HandlerDef(this, "controllers.Users", "signup", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:24
def listUser(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.listUser(username), HandlerDef(this, "controllers.Users", "listUser", Seq(classOf[String]), "GET", """ Update page""", _prefix + """update/$username<[^/]+>""")
)
                      

// @LINE:26
def update(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.update(username), HandlerDef(this, "controllers.Users", "update", Seq(classOf[String]), "POST", """""", _prefix + """update/$username<[^/]+>""")
)
                      
    
}
                          

// @LINE:32
class ReverseAssets {
    

// @LINE:32
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:29
// @LINE:17
// @LINE:14
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:29
def destination(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.destination(), HandlerDef(this, "controllers.Application", "destination", Seq(), "GET", """ Destination page""", _prefix + """destination""")
)
                      

// @LINE:17
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq(), "GET", """ Signup page""", _prefix + """signup""")
)
                      

// @LINE:14
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.test(), HandlerDef(this, "controllers.Application", "test", Seq(), "GET", """ Test page""", _prefix + """test""")
)
                      

// @LINE:9
def guest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.guest(), HandlerDef(this, "controllers.Application", "guest", Seq(), "GET", """ Guest page""", _prefix + """guest""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    