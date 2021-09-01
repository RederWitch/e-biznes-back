
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

object userPayment_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[CreateUserPaymentForm],Seq[User],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(payments: Form[CreateUserPaymentForm], user: Seq[User])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.113*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/flash/*5.7*/.get("success").getOrElse("")),format.raw/*5.36*/("""

"""),_display_(/*7.2*/form(routes.UserPaymentController.addUserPaymentHandle())/*7.59*/ {_display_(Seq[Any](format.raw/*7.61*/("""
"""),_display_(/*8.2*/helper/*8.8*/.CSRF.formField),format.raw/*8.23*/("""
"""),format.raw/*9.1*/("""<select name="userId" id="userId">
    """),_display_(/*10.6*/for(u <- user) yield /*10.20*/{_display_(Seq[Any](format.raw/*10.21*/("""
        """),format.raw/*11.9*/("""<option value=""""),_display_(/*11.25*/u/*11.26*/.id),format.raw/*11.29*/("""" selected>"""),_display_(/*11.41*/u/*11.42*/.nick),format.raw/*11.47*/("""</option>
    """)))}),format.raw/*12.6*/("""
"""),format.raw/*13.1*/("""</select>

"""),_display_(/*15.2*/inputText(payments("paymentType"))),format.raw/*15.36*/("""
"""),_display_(/*16.2*/inputText(payments("provider"))),format.raw/*16.33*/("""
"""),_display_(/*17.2*/inputText(payments("accountNumber"))),format.raw/*17.38*/("""
"""),_display_(/*18.2*/inputDate(payments("expiry"))),format.raw/*18.31*/("""

"""),format.raw/*20.1*/("""<div class="buttons">
    <input type="submit" value="Add"/>
</div>
""")))}))
      }
    }
  }

  def render(payments:Form[CreateUserPaymentForm],user:Seq[User],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(payments,user)(request,flash)

  def f:((Form[CreateUserPaymentForm],Seq[User]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (payments,user) => (request,flash) => apply(payments,user)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-08-19T21:51:03.303
                  SOURCE: /home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/app/views/userPayment_add.scala.html
                  HASH: 94bdbe5913ceacf4068b2f5a03248daff38e85e2
                  MATRIX: 798->1|982->117|1028->112|1058->134|1086->137|1098->142|1147->171|1177->176|1242->233|1281->235|1309->238|1322->244|1357->259|1385->261|1452->302|1482->316|1521->317|1558->327|1601->343|1611->344|1635->347|1674->359|1684->360|1710->365|1756->381|1785->383|1825->397|1880->431|1909->434|1961->465|1990->468|2047->504|2076->507|2126->536|2157->540
                  LINES: 21->1|24->3|27->1|29->4|30->5|30->5|30->5|32->7|32->7|32->7|33->8|33->8|33->8|34->9|35->10|35->10|35->10|36->11|36->11|36->11|36->11|36->11|36->11|36->11|37->12|38->13|40->15|40->15|41->16|41->16|42->17|42->17|43->18|43->18|45->20
                  -- GENERATED --
              */
          