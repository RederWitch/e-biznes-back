
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

object categories extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categories: Seq[Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),_display_(/*3.2*/for(category <- categories) yield /*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    """),format.raw/*4.5*/("""<strong>"""),_display_(/*4.14*/category/*4.22*/.name),format.raw/*4.27*/("""</strong>
    """),_display_(/*5.6*/category/*5.14*/.description),format.raw/*5.26*/("""
    """),format.raw/*6.5*/("""<a href=""""),_display_(/*6.15*/controllers/*6.26*/.routes.CategoryController.updateCategory(category.id)),format.raw/*6.80*/("""">Edit</a>
    <a href=""""),_display_(/*7.15*/controllers/*7.26*/.routes.CategoryController.deleteCategory(category.id)),format.raw/*7.80*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(categories:Seq[Category]): play.twirl.api.HtmlFormat.Appendable = apply(categories)

  def f:((Seq[Category]) => play.twirl.api.HtmlFormat.Appendable) = (categories) => apply(categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-08-19T21:51:03.552
                  SOURCE: /home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/app/views/categories.scala.html
                  HASH: 8c01ae49ed25437114750d69c4706921370bbac8
                  MATRIX: 741->1|863->28|893->33|935->60|974->62|1006->68|1041->77|1057->85|1082->90|1123->106|1139->114|1171->126|1203->132|1239->142|1258->153|1332->207|1384->233|1403->244|1477->298
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|31->6|32->7|32->7|32->7
                  -- GENERATED --
              */
          