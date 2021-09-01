
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

object cartItem_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Form[CreateCartItemForm],Seq[Product],Seq[Cart],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(add: Form[CreateCartItemForm], product: Seq[Product], cart: Seq[Cart])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.128*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.CartItemController.addCartItemHandle())/*7.53*/ {_display_(Seq[Any](format.raw/*7.55*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""

    """),_display_(/*10.6*/inputText(add("quantity"))),format.raw/*10.32*/("""

    """),format.raw/*12.5*/("""<select name="productId" id="productId">
    """),_display_(/*13.6*/for(u <- product) yield /*13.23*/{_display_(Seq[Any](format.raw/*13.24*/("""
        """),format.raw/*14.9*/("""<option value=""""),_display_(/*14.25*/u/*14.26*/.id),format.raw/*14.29*/("""">"""),_display_(/*14.32*/u/*14.33*/.name),format.raw/*14.38*/("""</option>
    """)))}),format.raw/*15.6*/("""
    """),format.raw/*16.5*/("""</select>

    <select name="cardId" id="cardId">
    """),_display_(/*19.6*/for(c <- cart) yield /*19.20*/{_display_(Seq[Any](format.raw/*19.21*/("""
        """),format.raw/*20.9*/("""<option value=""""),_display_(/*20.25*/c/*20.26*/.id),format.raw/*20.29*/("""">"""),_display_(/*20.32*/c/*20.33*/.id),format.raw/*20.36*/("""</option>
    """)))}),format.raw/*21.6*/("""
    """),format.raw/*22.5*/("""</select>

    <div class="buttons">
        <input type="submit" value="Add"/>
    </div>
""")))}))
      }
    }
  }

  def render(add:Form[CreateCartItemForm],product:Seq[Product],cart:Seq[Cart],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(add,product,cart)(request,flash)

  def f:((Form[CreateCartItemForm],Seq[Product],Seq[Cart]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (add,product,cart) => (request,flash) => apply(add,product,cart)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-08-19T21:51:02.993
                  SOURCE: /home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/app/views/cartItem_add.scala.html
                  HASH: 6ee49443e81057ff23b633879d641987d41c624c
                  MATRIX: 805->1|1004->132|1050->127|1080->149|1108->152|1120->157|1169->186|1199->191|1258->242|1297->244|1329->251|1343->257|1378->272|1413->281|1460->307|1495->315|1568->362|1601->379|1640->380|1677->390|1720->406|1730->407|1754->410|1784->413|1794->414|1820->419|1866->435|1899->441|1983->499|2013->513|2052->514|2089->524|2132->540|2142->541|2166->544|2196->547|2206->548|2230->551|2276->567|2309->573
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|35->10|35->10|37->12|38->13|38->13|38->13|39->14|39->14|39->14|39->14|39->14|39->14|39->14|40->15|41->16|44->19|44->19|44->19|45->20|45->20|45->20|45->20|45->20|45->20|45->20|46->21|47->22
                  -- GENERATED --
              */
          