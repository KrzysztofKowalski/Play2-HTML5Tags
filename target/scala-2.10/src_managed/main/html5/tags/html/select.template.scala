
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
 * Generate an HTML select.
 *
 * Example:
 * {{{
 * @select(field = myForm("isDone"), options = options("Yes","No"))
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra attributes.
 * @param handler The field constructor.
 */
object select extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template5[play.api.data.Field,Seq[scala.Tuple2[String, String]],Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML select.
 *
 * Example:
 * {{{
 * @select(field = myForm("isDone"), options = options("Yes","No"))
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra attributes.
 * @param handler The field constructor.
 */
    def apply/*13.2*/(field: play.api.data.Field, options: Seq[(String,String)], args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.Html = {
        _display_ {import html5.templates._

import views.html.helper.input


Seq[Any](format.raw/*13.162*/("""

"""),format.raw/*17.1*/("""
"""),_display_(Seq[Any](/*18.2*/input(field, args:_*)/*18.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*18.56*/("""
    <select id=""""),_display_(Seq[Any](/*19.18*/id)),format.raw/*19.20*/("""" name=""""),_display_(Seq[Any](/*19.29*/name)),format.raw/*19.33*/("""" """),_display_(Seq[Any](/*19.36*/toHtmlArgs(htmlArgs))),format.raw/*19.56*/(""" """),_display_(Seq[Any](/*19.58*/Html5Templates/*19.72*/.toValidation(field))),format.raw/*19.92*/(""">
        """),_display_(Seq[Any](/*20.10*/args/*20.14*/.toMap.get('_default).map/*20.39*/ { defaultValue =>_display_(Seq[Any](format.raw/*20.57*/("""
            <option class="blank" value="">"""),_display_(Seq[Any](/*21.45*/defaultValue)),format.raw/*21.57*/("""</option>
        """)))})),format.raw/*22.10*/("""
        """),_display_(Seq[Any](/*23.10*/options/*23.17*/.map/*23.21*/ { v =>_display_(Seq[Any](format.raw/*23.28*/("""
            <option value=""""),_display_(Seq[Any](/*24.29*/v/*24.30*/._1)),format.raw/*24.33*/("""" """),_display_(Seq[Any](/*24.36*/(if(value == Some(v._1)) "selected" else ""))),format.raw/*24.80*/(""">"""),_display_(Seq[Any](/*24.82*/v/*24.83*/._2)),format.raw/*24.86*/("""</option>
        """)))})),format.raw/*25.10*/("""
    </select>
""")))})),format.raw/*27.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,options:Seq[scala.Tuple2[String, String]],args:Array[scala.Tuple2[Symbol, Any]],handler:views.html.helper.FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,options,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Seq[scala.Tuple2[String, String]],Array[scala.Tuple2[Symbol, Any]]) => (views.html.helper.FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,options,args) => (handler,lang) => apply(field,options,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 19 15:46:08 CEST 2013
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/select.scala.html
                    HASH: be14fc7b6250f66e9a4b8a92df489f3e4ae17803
                    MATRIX: 1134->250|1430->410|1459->470|1496->472|1526->493|1597->526|1651->544|1675->546|1720->555|1746->559|1785->562|1827->582|1865->584|1888->598|1930->618|1977->629|1990->633|2024->658|2080->676|2161->721|2195->733|2246->752|2292->762|2308->769|2321->773|2366->780|2431->809|2441->810|2466->813|2505->816|2571->860|2609->862|2619->863|2644->866|2695->885|2742->901
                    LINES: 41->13|47->13|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|53->21|54->22|55->23|55->23|55->23|55->23|56->24|56->24|56->24|56->24|56->24|56->24|56->24|56->24|57->25|59->27
                    -- GENERATED --
                */
            