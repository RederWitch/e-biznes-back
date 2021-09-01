
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

object users extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: Seq[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/for(user <- users) yield /*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<strong>"""),_display_(/*4.14*/user/*4.18*/.nick),format.raw/*4.23*/("""</strong>
    """),_display_(/*5.6*/user/*5.10*/.firstName),format.raw/*5.20*/("""
    """),_display_(/*6.6*/user/*6.10*/.lastName),format.raw/*6.19*/("""
    """),_display_(/*7.6*/user/*7.10*/.email),format.raw/*7.16*/("""
    """),format.raw/*8.5*/("""<a href=""""),_display_(/*8.15*/controllers/*8.26*/.routes.UserController.updateUser(user.id)),format.raw/*8.68*/("""">Edit</a>
    <a href=""""),_display_(/*9.15*/controllers/*9.26*/.routes.UserController.deleteUser(user.id)),format.raw/*9.68*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(users:Seq[User]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((Seq[User]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-08-19T21:51:02.578
                  SOURCE: /home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/app/views/users.scala.html
                  HASH: 62f054c911aabe4159e01110f6797261a392bc4e
                  MATRIX: 732->1|845->19|875->24|908->42|947->44|979->50|1014->59|1026->63|1051->68|1092->84|1104->88|1134->98|1166->105|1178->109|1207->118|1239->125|1251->129|1277->135|1309->141|1345->151|1364->162|1426->204|1478->230|1497->241|1559->283
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|33->8|34->9|34->9|34->9
                  -- GENERATED --
              */
          