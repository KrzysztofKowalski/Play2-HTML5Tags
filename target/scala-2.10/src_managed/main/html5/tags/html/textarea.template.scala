
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
 * Generate an HTML textarea.
 *
 * Example:
 * {{{
 * @textarea(field = myForm("address"), args = 'rows -> 3, 'cols -> 50)
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra attributes.
 * @param handler The field constructor.
 */
object textarea extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML textarea.
 *
 * Example:
 * {{{
 * @textarea(field = myForm("address"), args = 'rows -> 3, 'cols -> 50)
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra attributes.
 * @param handler The field constructor.
 */
    def apply/*13.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.Html = {
        _display_ {import html5.templates._

import views.html.helper._


Seq[Any](format.raw/*13.131*/("""

"""),format.raw/*17.1*/("""
"""),_display_(Seq[Any](/*18.2*/input(field, args:_*)/*18.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*18.56*/("""
    <textarea id=""""),_display_(Seq[Any](/*19.20*/id)),format.raw/*19.22*/("""" name=""""),_display_(Seq[Any](/*19.31*/name)),format.raw/*19.35*/("""" """),_display_(Seq[Any](/*19.38*/toHtmlArgs(htmlArgs))),format.raw/*19.58*/(""" """),_display_(Seq[Any](/*19.60*/Html5Templates/*19.74*/.toValidation(field))),format.raw/*19.94*/(""">"""),_display_(Seq[Any](/*19.96*/value)),format.raw/*19.101*/("""</textarea>
""")))})),format.raw/*20.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:views.html.helper.FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (views.html.helper.FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 19 15:46:08 CEST 2013
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/textarea.scala.html
                    HASH: c10d1b8a1bd6df94f9041603326ecb67368e919c
                    MATRIX: 1114->256|1375->385|1404->441|1441->443|1471->464|1542->497|1598->517|1622->519|1667->528|1693->532|1732->535|1774->555|1812->557|1835->571|1877->591|1915->593|1943->598|1987->611
                    LINES: 41->13|47->13|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|52->20
                    -- GENERATED --
                */
            