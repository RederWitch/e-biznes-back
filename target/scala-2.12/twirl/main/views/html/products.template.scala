
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: Seq[Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""

"""),_display_(/*3.2*/for(product <- products) yield /*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
    """),format.raw/*4.5*/("""<strong>"""),_display_(/*4.14*/product/*4.21*/.name),format.raw/*4.26*/("""</strong>
    """),_display_(/*5.6*/product/*5.13*/.description),format.raw/*5.25*/("""
    """),_display_(/*6.6*/product/*6.13*/.price),format.raw/*6.19*/("""
    """),_display_(/*7.6*/product/*7.13*/.height),format.raw/*7.20*/("""
    """),_display_(/*8.6*/product/*8.13*/.weight),format.raw/*8.20*/("""
    """),_display_(/*9.6*/product/*9.13*/.width),format.raw/*9.19*/("""
    """),format.raw/*10.5*/("""<a href=""""),_display_(/*10.15*/controllers/*10.26*/.routes.ProductController.updateProduct(product.id)),format.raw/*10.77*/("""">Edit</a>
    <a href=""""),_display_(/*11.15*/controllers/*11.26*/.routes.ProductController.deleteProduct(product.id)),format.raw/*11.77*/("""">Delete</a>
    </br>
""")))}))
      }
    }
  }

  def render(products:Seq[Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((Seq[Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-08-19T21:51:03.195
                  SOURCE: /home/wiki/Pulpit/e-biznes-main/shop-project/shop-project/app/views/products.scala.html
                  HASH: 880c08e546e4f0da4611919dc689eada1af373f0
                  MATRIX: 738->1|857->25|887->30|926->54|965->56|997->62|1032->71|1047->78|1072->83|1113->99|1128->106|1160->118|1192->125|1207->132|1233->138|1265->145|1280->152|1307->159|1339->166|1354->173|1381->180|1413->187|1428->194|1454->200|1487->206|1524->216|1544->227|1616->278|1669->304|1689->315|1761->366
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|29->4|30->5|30->5|30->5|31->6|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|35->10|35->10|35->10|36->11|36->11|36->11
                  -- GENERATED --
              */
          