
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/alistair/lunch-app/conf/routes
// @DATE:Tue Jun 06 11:21:16 BST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseWelcomeController WelcomeController = new controllers.ReverseWelcomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseWelcomeController WelcomeController = new controllers.javascript.ReverseWelcomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
