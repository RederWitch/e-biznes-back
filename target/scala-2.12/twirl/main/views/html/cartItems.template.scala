
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

object cartItems extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[CartItem],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cart: Seq[CartItem]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""

"""),_display_(/*3.2*/for(a <- cart) yield /*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
    """),_display_(/*4.6*/a/*4.7*/.id),format.raw/*4.10*/(""" """),format.raw/*4.11*/("""|
    """),_display_(/*5.6*/a/*5.7*/.productId),format.raw/*5.17*/(""" """),format.raw/*5.18*/("""|
    """),_display_(/*6.6*/a/*6.7*/.quantity),format.raw/*6.16*/(""" """),format.raw/*6.17*/("""|
    """),_display_(/*7.6*/a/*7.7*/.cartId),format.raw/*7.14*/("""

    """),format.raw/*9.5*/("""<a href=""""),_display_(/*9.15*/controllers/*9.26*/.routes.CartItemController.updateCartItem(a.id)),format.raw/*9.73*/("""">Edit</a>
    <a href=""""),_display_(/*10.15*/controllers/*10.26*/.routes.CartItemController.deleteCartItem(a.id)),format.raw/*10.73*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(cart:Seq[CartItem]): play.twirl.api.HtmlFormat.Appendable = apply(cart)

  def f:((Seq[CartItem]) => play.twirl.api.HtmlFormat.Appendable) = (cart) => apply(cart)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-08-19T21:51:02.525
                  SOURCE: /home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/app/views/cartItems.scala.html
                  HASH: 9489fef0cb5455476e05129407e225c1dfb2c6fe
                  MATRIX: 740->1|856->22|886->27|915->41|954->43|986->50|994->51|1017->54|1045->55|1078->63|1086->64|1116->74|1144->75|1177->83|1185->84|1214->93|1242->94|1275->102|1283->103|1310->110|1344->118|1380->128|1399->139|1466->186|1519->212|1539->223|1607->270
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|29->4|30->5|30->5|30->5|30->5|31->6|31->6|31->6|31->6|32->7|32->7|32->7|34->9|34->9|34->9|34->9|35->10|35->10|35->10
                  -- GENERATED --
              */
          