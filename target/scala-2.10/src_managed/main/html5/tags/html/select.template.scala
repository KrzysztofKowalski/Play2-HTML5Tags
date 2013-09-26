
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
object select extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[play.api.data.Field,Seq[scala.Tuple2[String, String]],Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*13.2*/(field: play.api.data.Field, options: Seq[(String,String)], args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.HtmlFormat.Appendable = {
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
    
    def render(field:play.api.data.Field,options:Seq[scala.Tuple2[String, String]],args:Array[scala.Tuple2[Symbol, Any]],handler:views.html.helper.FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.HtmlFormat.Appendable = apply(field,options,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Seq[scala.Tuple2[String, String]],Array[scala.Tuple2[Symbol, Any]]) => (views.html.helper.FieldConstructor,play.api.i18n.Lang) => play.api.templates.HtmlFormat.Appendable) = (field,options,args) => (handler,lang) => apply(field,options,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 26 17:52:23 CEST 2013
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/select.scala.html
                    HASH: 504eace6ce7a9f769a0a4fe462d4f0708a041e37
                    MATRIX: 1185->250|1498->410|1527->470|1564->472|1594->493|1665->526|1719->544|1743->546|1788->555|1814->559|1853->562|1895->582|1933->584|1956->598|1998->618|2045->629|2058->633|2092->658|2148->676|2229->721|2263->733|2314->752|2360->762|2376->769|2389->773|2434->780|2499->809|2509->810|2534->813|2573->816|2639->860|2677->862|2687->863|2712->866|2763->885|2810->901
                    LINES: 41->13|47->13|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|53->21|53->21|54->22|55->23|55->23|55->23|55->23|56->24|56->24|56->24|56->24|56->24|56->24|56->24|56->24|57->25|59->27
                    -- GENERATED --
                */
            