
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object usersAddresses extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[UserAddress],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(add: Seq[UserAddress]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/for(a <- add) yield /*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),_display_(/*4.6*/a/*4.7*/.userId),format.raw/*4.14*/("""
    """),_display_(/*5.6*/a/*5.7*/.city),format.raw/*5.12*/("""
    """),_display_(/*6.6*/a/*6.7*/.postalCode),format.raw/*6.18*/("""
    """),_display_(/*7.6*/a/*7.7*/.country),format.raw/*7.15*/("""
    """),_display_(/*8.6*/a/*8.7*/.telephone),format.raw/*8.17*/("""
    """),_display_(/*9.6*/a/*9.7*/.mobile),format.raw/*9.14*/("""
    """),_display_(/*10.6*/a/*10.7*/.addressLine),format.raw/*10.19*/("""

    """),format.raw/*12.5*/("""<a href=""""),_display_(/*12.15*/controllers/*12.26*/.routes.UserAddressController.updateUserAddress(a.id)),format.raw/*12.79*/("""">Edit</a>
    <a href=""""),_display_(/*13.15*/controllers/*13.26*/.routes.UserAddressController.deleteUserAddress(a.id)),format.raw/*13.79*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(add:Seq[UserAddress]): play.twirl.api.HtmlFormat.Appendable = apply(add)

  def f:((Seq[UserAddress]) => play.twirl.api.HtmlFormat.Appendable) = (add) => apply(add)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-08-19T21:51:02.794
                  SOURCE: /home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/app/views/usersAddresses.scala.html
                  HASH: f323d3315e9691e14a4a8dd1f0cbd419015fe137
                  MATRIX: 748->1|866->24|896->29|924->42|963->44|995->51|1003->52|1030->59|1062->66|1070->67|1095->72|1127->79|1135->80|1166->91|1198->98|1206->99|1234->107|1266->114|1274->115|1304->125|1336->132|1344->133|1371->140|1404->147|1413->148|1446->160|1481->168|1518->178|1538->189|1612->242|1665->268|1685->279|1759->332
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|35->10|35->10|37->12|37->12|37->12|37->12|38->13|38->13|38->13
                  -- GENERATED --
              */
          