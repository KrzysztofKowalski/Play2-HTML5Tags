
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
 * Generate an HTML input date field with HTML5 validation attributes
 * The validation attributes are generated from the constraints defined on the model
 */
object date extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.HtmlFormat.Appendable] {

    /**
 * Generate an HTML input date field with HTML5 validation attributes
 * The validation attributes are generated from the constraints defined on the model
 */
    def apply/*5.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import html5.templates._

import views.html.helper._


Seq[Any](format.raw/*5.131*/("""

"""),format.raw/*9.1*/("""
"""),_display_(Seq[Any](/*10.2*/input(field, args:_*)/*10.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*10.56*/("""
    <input type="date" id=""""),_display_(Seq[Any](/*11.29*/id)),format.raw/*11.31*/("""" name=""""),_display_(Seq[Any](/*11.40*/name)),format.raw/*11.44*/("""" value=""""),_display_(Seq[Any](/*11.54*/value)),format.raw/*11.59*/("""" """),_display_(Seq[Any](/*11.62*/toHtmlArgs(htmlArgs))),format.raw/*11.82*/(""" """),_display_(Seq[Any](/*11.84*/Html5Templates/*11.98*/.toValidation(field))),format.raw/*11.118*/(""">
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
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/date.scala.html
                    HASH: 2432491fc1ad0c98d95b73a11a633527eacfb09a
                    MATRIX: 976->164|1253->293|1281->349|1318->351|1348->372|1419->405|1484->434|1508->436|1553->445|1579->449|1625->459|1652->464|1691->467|1733->487|1771->489|1794->503|1837->523|1871->526
                    LINES: 25->5|31->5|33->9|34->10|34->10|34->10|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|36->12
                    -- GENERATED --
                */
            