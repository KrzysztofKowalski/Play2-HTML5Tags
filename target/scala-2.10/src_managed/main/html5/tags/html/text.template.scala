
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
 * Generate an HTML input text with HTML5 validation attributes
 * The validation attributes are generated from the constraints defined on the model
 */
object text extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.HtmlFormat.Appendable] {

    /**
 * Generate an HTML input text with HTML5 validation attributes
 * The validation attributes are generated from the constraints defined on the model
 */
    def apply/*5.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import html5.templates._

import views.html.helper._


Seq[Any](format.raw/*5.131*/("""

"""),format.raw/*9.1*/("""
"""),_display_(Seq[Any](/*10.2*/input(field, args:_*)/*10.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*10.56*/("""
    <input type=""""),_display_(Seq[Any](/*11.19*/Html5Templates/*11.33*/.findType(field))),format.raw/*11.49*/("""" id=""""),_display_(Seq[Any](/*11.56*/id)),format.raw/*11.58*/("""" name=""""),_display_(Seq[Any](/*11.67*/name)),format.raw/*11.71*/("""" value=""""),_display_(Seq[Any](/*11.81*/value)),format.raw/*11.86*/("""" """),_display_(Seq[Any](/*11.89*/toHtmlArgs(htmlArgs))),format.raw/*11.109*/(""" """),_display_(Seq[Any](/*11.111*/Html5Templates/*11.125*/.toValidation(field))),format.raw/*11.145*/(""">
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
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/text.scala.html
                    HASH: adf9baf8aaa23e6dbca03696b6f3d0fa44f17907
                    MATRIX: 964->158|1241->287|1269->343|1306->345|1336->366|1407->399|1462->418|1485->432|1523->448|1566->455|1590->457|1635->466|1661->470|1707->480|1734->485|1773->488|1816->508|1855->510|1879->524|1922->544|1956->547
                    LINES: 25->5|31->5|33->9|34->10|34->10|34->10|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|36->12
                    -- GENERATED --
                */
            