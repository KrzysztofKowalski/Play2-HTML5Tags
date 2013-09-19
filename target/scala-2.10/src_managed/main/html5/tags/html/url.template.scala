
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
 * Generate an HTML input url field with HTML5 validation attributes
 * The validation attributes are generated from the constraints defined on the model
 */
object url extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML input url field with HTML5 validation attributes
 * The validation attributes are generated from the constraints defined on the model
 */
    def apply/*5.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.Html = {
        _display_ {import html5.templates._

import views.html.helper._


Seq[Any](format.raw/*5.131*/("""

"""),format.raw/*9.1*/("""
"""),_display_(Seq[Any](/*10.2*/input(field, args:_*)/*10.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*10.56*/("""
    <input type="url" id=""""),_display_(Seq[Any](/*11.28*/id)),format.raw/*11.30*/("""" name=""""),_display_(Seq[Any](/*11.39*/name)),format.raw/*11.43*/("""" value=""""),_display_(Seq[Any](/*11.53*/value)),format.raw/*11.58*/("""" """),_display_(Seq[Any](/*11.61*/toHtmlArgs(htmlArgs))),format.raw/*11.81*/(""" """),_display_(Seq[Any](/*11.83*/Html5Templates/*11.97*/.toValidation(field))),format.raw/*11.117*/(""">
""")))})),format.raw/*12.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:views.html.helper.FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (views.html.helper.FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 19 15:46:08 CEST 2013
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/url.scala.html
                    HASH: 8e5b6e56d3b91bc2548eaa3ac79108d0d6969653
                    MATRIX: 922->163|1182->292|1210->348|1247->350|1277->371|1348->404|1412->432|1436->434|1481->443|1507->447|1553->457|1580->462|1619->465|1661->485|1699->487|1722->501|1765->521|1799->524
                    LINES: 25->5|31->5|33->9|34->10|34->10|34->10|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|36->12
                    -- GENERATED --
                */
            