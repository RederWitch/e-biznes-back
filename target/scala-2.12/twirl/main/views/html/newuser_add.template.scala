
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

object newuser_add extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateUserForm],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(newUser: Form[CreateUserForm])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/flash/*4.7*/.get("success").getOrElse("")),format.raw/*4.36*/("""
"""),_display_(/*5.2*/form(routes.UserController.addUserHandle())/*5.45*/ {_display_(Seq[Any](format.raw/*5.47*/("""
"""),_display_(/*6.2*/helper/*6.8*/.CSRF.formField),format.raw/*6.23*/("""
"""),_display_(/*7.2*/inputText(newUser("nick"))),format.raw/*7.28*/("""
"""),_display_(/*8.2*/inputText(newUser("firstName"))),format.raw/*8.33*/("""
"""),_display_(/*9.2*/inputText(newUser("lastName"))),format.raw/*9.32*/("""
"""),_display_(/*10.2*/inputText(newUser("email"))),format.raw/*10.29*/("""
"""),_display_(/*11.2*/inputPassword(newUser("password"))),format.raw/*11.36*/("""

"""),format.raw/*13.1*/("""<div class="buttons">
    <input type="submit" value="Submit"/>
</div>
""")))}))
      }
    }
  }

  def render(newUser:Form[CreateUserForm],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(newUser)(request,flash)

  def f:((Form[CreateUserForm]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (newUser) => (request,flash) => apply(newUser)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-08-19T21:51:03.412
                  SOURCE: /home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/app/views/newuser_add.scala.html
                  HASH: d7bdb2c9b99badd535d2a95931a1fa307b542384
                  MATRIX: 777->1|936->89|980->105|1007->107|1019->112|1068->141|1095->143|1146->186|1185->188|1212->190|1225->196|1260->211|1287->213|1333->239|1360->241|1411->272|1438->274|1488->304|1516->306|1564->333|1592->335|1647->369|1676->371
                  LINES: 21->1|24->2|27->3|28->4|28->4|28->4|29->5|29->5|29->5|30->6|30->6|30->6|31->7|31->7|32->8|32->8|33->9|33->9|34->10|34->10|35->11|35->11|37->13
                  -- GENERATED --
              */
          