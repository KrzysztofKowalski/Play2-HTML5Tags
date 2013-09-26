
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
object textarea extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*13.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import html5.templates._

import views.html.helper._


Seq[Any](format.raw/*13.131*/("""

"""),format.raw/*17.1*/("""
"""),_display_(Seq[Any](/*18.2*/input(field, args:_*)/*18.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*18.56*/("""
    <textarea id=""""),_display_(Seq[Any](/*19.20*/id)),format.raw/*19.22*/("""" name=""""),_display_(Seq[Any](/*19.31*/name)),format.raw/*19.35*/("""" """),_display_(Seq[Any](/*19.38*/toHtmlArgs(htmlArgs))),format.raw/*19.58*/(""" """),_display_(Seq[Any](/*19.60*/Html5Templates/*19.74*/.toValidation(field))),format.raw/*19.94*/(""">"""),_display_(Seq[Any](/*19.96*/value)),format.raw/*19.101*/("""</textarea>
""")))})),format.raw/*20.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:views.html.helper.FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.HtmlFormat.Appendable = apply(field,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (views.html.helper.FieldConstructor,play.api.i18n.Lang) => play.api.templates.HtmlFormat.Appendable) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 26 17:52:23 CEST 2013
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/textarea.scala.html
                    HASH: bd71219fa418abf1f7710cfc3b993040125bb7ae
                    MATRIX: 1165->256|1443->385|1472->441|1509->443|1539->464|1610->497|1666->517|1690->519|1735->528|1761->532|1800->535|1842->555|1880->557|1903->571|1945->591|1983->593|2011->598|2055->611
                    LINES: 41->13|47->13|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|52->20
                    -- GENERATED --
                */
            