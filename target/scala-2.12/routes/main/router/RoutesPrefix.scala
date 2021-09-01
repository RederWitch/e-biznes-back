// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/conf/routes
// @DATE:Thu Aug 19 21:51:00 CEST 2021


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
