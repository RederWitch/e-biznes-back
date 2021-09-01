
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

object userAddress_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[CreateUserAddressForm],Seq[User],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(add: Form[CreateUserAddressForm], user: Seq[User])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.108*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.UserAddressController.addUserAddressHandle())/*7.59*/ {_display_(Seq[Any](format.raw/*7.61*/("""
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<select name="userId" id="userId">
    """),_display_(/*10.6*/for(u <- user) yield /*10.20*/{_display_(Seq[Any](format.raw/*10.21*/("""
        """),format.raw/*11.9*/("""<option value=""""),_display_(/*11.25*/u/*11.26*/.id),format.raw/*11.29*/("""" selected>"""),_display_(/*11.41*/u/*11.42*/.nick),format.raw/*11.47*/("""</option>
    """)))}),format.raw/*12.6*/("""
    """),format.raw/*13.5*/("""</select>

    """),_display_(/*15.6*/inputText(add("city"))),format.raw/*15.28*/("""
    """),_display_(/*16.6*/inputText(add("postalCode"))),format.raw/*16.34*/("""
    """),_display_(/*17.6*/inputText(add("country"))),format.raw/*17.31*/("""
    """),_display_(/*18.6*/inputText(add("telephone"))),format.raw/*18.33*/("""
    """),_display_(/*19.6*/inputText(add("mobile"))),format.raw/*19.30*/("""
    """),_display_(/*20.6*/inputText(add("addressLine"))),format.raw/*20.35*/("""

    """),format.raw/*22.5*/("""<div class="buttons">
        <input type="submit" value="Add"/>
    </div>
""")))}))
      }
    }
  }

  def render(add:Form[CreateUserAddressForm],user:Seq[User],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(add,user)(request,flash)

  def f:((Form[CreateUserAddressForm],Seq[User]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (add,user) => (request,flash) => apply(add,user)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-08-19T21:51:01.975
                  SOURCE: /home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/app/views/userAddress_add.scala.html
                  HASH: 3a583c2538ab1634ff62bfb118195c53cf3d6eca
                  MATRIX: 798->1|977->112|1023->107|1053->129|1081->132|1093->137|1142->166|1172->171|1237->228|1276->230|1308->237|1322->243|1357->258|1389->264|1456->305|1486->319|1525->320|1562->330|1605->346|1615->347|1639->350|1678->362|1688->363|1714->368|1760->384|1793->390|1837->408|1880->430|1913->437|1962->465|1995->472|2041->497|2074->504|2122->531|2155->538|2200->562|2233->569|2283->598|2318->606
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|35->10|35->10|35->10|36->11|36->11|36->11|36->11|36->11|36->11|36->11|37->12|38->13|40->15|40->15|41->16|41->16|42->17|42->17|43->18|43->18|44->19|44->19|45->20|45->20|47->22
                  -- GENERATED --
              */
          