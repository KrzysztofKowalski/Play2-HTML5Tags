
package html5.tags.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**
 * Generate an HTML input email field with HTML5 validation attributes
 * The validation attributes are generated from the constraints defined on the model
 */
object email extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.HtmlFormat.Appendable] {

    /**
 * Generate an HTML input email field with HTML5 validation attributes
 * The validation attributes are generated from the constraints defined on the model
 */
    def apply/*5.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import html5.templates._

import views.html.helper._


Seq[Any](format.raw/*5.131*/("""

"""),format.raw/*9.1*/("""
"""),_display_(Seq[Any](/*10.2*/input(field, args:_*)/*10.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*10.56*/("""
    <input type="email" id=""""),_display_(Seq[Any](/*11.30*/id)),format.raw/*11.32*/("""" name=""""),_display_(Seq[Any](/*11.41*/name)),format.raw/*11.45*/("""" value=""""),_display_(Seq[Any](/*11.55*/value)),format.raw/*11.60*/("""" """),_display_(Seq[Any](/*11.63*/toHtmlArgs(htmlArgs))),format.raw/*11.83*/(""" """),_display_(Seq[Any](/*11.85*/Html5Templates/*11.99*/.toValidation(field))),format.raw/*11.119*/(""">
""")))})),format.raw/*12.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:views.html.helper.FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.HtmlFormat.Appendable = apply(field,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (views.html.helper.FieldConstructor,play.api.i18n.Lang) => play.api.templates.HtmlFormat.Appendable) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 26 17:52:23 CEST 2013
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/email.scala.html
                    HASH: cf5f7d750832618237e608e773f88ceb0050ef17
                    MATRIX: 979->165|1256->294|1284->350|1321->352|1351->373|1422->406|1488->436|1512->438|1557->447|1583->451|1629->461|1656->466|1695->469|1737->489|1775->491|1798->505|1841->525|1875->528
                    LINES: 25->5|31->5|33->9|34->10|34->10|34->10|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|36->12
                    -- GENERATED --
                */
            