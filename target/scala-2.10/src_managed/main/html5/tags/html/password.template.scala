
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
object password extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML input text with HTML5 validation attributes
 * The validation attributes are generated from the constraints defined on the model
 */
    def apply/*5.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.Html = {
        _display_ {import html5.templates._

import views.html.helper._


Seq[Any](format.raw/*5.131*/("""

"""),format.raw/*9.1*/("""
"""),_display_(Seq[Any](/*10.2*/input(field, args:_*)/*10.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*10.56*/("""
    <input type="password" id=""""),_display_(Seq[Any](/*11.33*/id)),format.raw/*11.35*/("""" name=""""),_display_(Seq[Any](/*11.44*/name)),format.raw/*11.48*/("""" value=""""),_display_(Seq[Any](/*11.58*/value)),format.raw/*11.63*/("""" """),_display_(Seq[Any](/*11.66*/toHtmlArgs(htmlArgs))),format.raw/*11.86*/(""" """),_display_(Seq[Any](/*11.88*/Html5Templates/*11.102*/.toValidation(field))),format.raw/*11.122*/(""">
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
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/password.scala.html
                    HASH: 0b7748d431588f54fb1e9d9769d2f7c6febcf52f
                    MATRIX: 917->158|1177->287|1205->343|1242->345|1272->366|1343->399|1412->432|1436->434|1481->443|1507->447|1553->457|1580->462|1619->465|1661->485|1699->487|1723->501|1766->521|1800->524
                    LINES: 25->5|31->5|33->9|34->10|34->10|34->10|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|36->12
                    -- GENERATED --
                */
            