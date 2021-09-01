
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

object usersPayments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[UserPayment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(payments: Seq[UserPayment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/for(pay <- payments) yield /*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),_display_(/*4.6*/pay/*4.9*/.userId),format.raw/*4.16*/("""
    """),_display_(/*5.6*/pay/*5.9*/.paymentType),format.raw/*5.21*/("""
    """),_display_(/*6.6*/pay/*6.9*/.provider),format.raw/*6.18*/("""
    """),_display_(/*7.6*/pay/*7.9*/.accountNumber),format.raw/*7.23*/("""
    """),_display_(/*8.6*/pay/*8.9*/.expiry),format.raw/*8.16*/("""

    """),format.raw/*10.5*/("""<a href=""""),_display_(/*10.15*/controllers/*10.26*/.routes.UserPaymentController.updateUserPayment(pay.id)),format.raw/*10.81*/("""">Edit</a>
    <a href=""""),_display_(/*11.15*/controllers/*11.26*/.routes.UserPaymentController.deleteUserPayment(pay.id)),format.raw/*11.81*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(payments:Seq[UserPayment]): play.twirl.api.HtmlFormat.Appendable = apply(payments)

  def f:((Seq[UserPayment]) => play.twirl.api.HtmlFormat.Appendable) = (payments) => apply(payments)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-08-19T21:51:03.424
                  SOURCE: /home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/app/views/usersPayments.scala.html
                  HASH: 0bfe5f993364287c23131c29486b07d2bce1e1d5
                  MATRIX: 747->1|870->29|900->34|935->54|974->56|1006->63|1016->66|1043->73|1075->80|1085->83|1117->95|1149->102|1159->105|1188->114|1220->121|1230->124|1264->138|1296->145|1306->148|1333->155|1368->163|1405->173|1425->184|1501->239|1554->265|1574->276|1650->331
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|35->10|35->10|35->10|35->10|36->11|36->11|36->11
                  -- GENERATED --
              */
          