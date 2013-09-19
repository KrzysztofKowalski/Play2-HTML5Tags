
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
object email extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML input email field with HTML5 validation attributes
 * The validation attributes are generated from the constraints defined on the model
 */
    def apply/*5.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.Html = {
        _display_ {import html5.templates._

import views.html.helper._


Seq[Any](format.raw/*5.131*/("""

"""),format.raw/*9.1*/("""
"""),_display_(Seq[Any](/*10.2*/input(field, args:_*)/*10.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*10.56*/("""
    <input type="email" id=""""),_display_(Seq[Any](/*11.30*/id)),format.raw/*11.32*/("""" name=""""),_display_(Seq[Any](/*11.41*/name)),format.raw/*11.45*/("""" value=""""),_display_(Seq[Any](/*11.55*/value)),format.raw/*11.60*/("""" """),_display_(Seq[Any](/*11.63*/toHtmlArgs(htmlArgs))),format.raw/*11.83*/(""" """),_display_(Seq[Any](/*11.85*/Html5Templates/*11.99*/.toValidation(field))),format.raw/*11.119*/(""">
""")))})),format.raw/*12.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:views.html.helper.FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (views.html.helper.FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 19 15:46:07 CEST 2013
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/email.scala.html
                    HASH: 0154ced17238080f7fd806e5f5394fabe0900213
                    MATRIX: 928->165|1188->294|1216->350|1253->352|1283->373|1354->406|1420->436|1444->438|1489->447|1515->451|1561->461|1588->466|1627->469|1669->489|1707->491|1730->505|1773->525|1807->528
                    LINES: 25->5|31->5|33->9|34->10|34->10|34->10|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|36->12
                    -- GENERATED --
                */
            