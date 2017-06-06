
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/alistair/lunch-app/conf/routes
// @DATE:Tue Jun 06 11:21:16 BST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
