
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
 * Generate an HTML input checkbox.
 *
 * Example:
 * {{{
 * @checkbox(field = myForm("done"))
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra HTML attributes ('''id''' and '''label''' are 2 special arguments).
 * @param handler The field constructor.
 */
object checkbox extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.HtmlFormat.Appendable] {

    /**
 * Generate an HTML input checkbox.
 *
 * Example:
 * {{{
 * @checkbox(field = myForm("done"))
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra HTML attributes ('''id''' and '''label''' are 2 special arguments).
 * @param handler The field constructor.
 */
    def apply/*13.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import html5.templates._

import views.html.helper._

def /*18.2*/boxValue/*18.10*/ = {{ args.toMap.get('value).getOrElse("true") }};
Seq[Any](format.raw/*13.131*/("""

"""),format.raw/*17.1*/("""
"""),format.raw/*18.58*/("""

"""),_display_(Seq[Any](/*20.2*/input(field, args:_*)/*20.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*20.56*/("""
    <input type="checkbox" id=""""),_display_(Seq[Any](/*21.33*/id)),format.raw/*21.35*/("""" name=""""),_display_(Seq[Any](/*21.44*/name)),format.raw/*21.48*/("""" value=""""),_display_(Seq[Any](/*21.58*/boxValue)),format.raw/*21.66*/("""" """),_display_(Seq[Any](/*21.69*/(if(value == Some(boxValue)) "checked" else ""))),format.raw/*21.116*/(""" """),_display_(Seq[Any](/*21.118*/toHtmlArgs(htmlArgs.filterKeys(_ != 'value)))),format.raw/*21.162*/(""" """),_display_(Seq[Any](/*21.164*/Html5Templates/*21.178*/.toValidation(field))),format.raw/*21.198*/(""">
    <span>"""),_display_(Seq[Any](/*22.12*/args/*22.16*/.toMap.get('_text))),format.raw/*22.34*/("""</span>
""")))})),format.raw/*23.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:views.html.helper.FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.HtmlFormat.Appendable = apply(field,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (views.html.helper.FieldConstructor,play.api.i18n.Lang) => play.api.templates.HtmlFormat.Appendable) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 26 17:52:23 CEST 2013
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/checkbox.scala.html
                    HASH: 4970d9bf9685eb91df6076019fdb1e6a05bee155
                    MATRIX: 1219->283|1479->470|1496->478|1576->412|1605->468|1634->526|1672->529|1702->550|1773->583|1842->616|1866->618|1911->627|1937->631|1983->641|2013->649|2052->652|2122->699|2161->701|2228->745|2267->747|2291->761|2334->781|2383->794|2396->798|2436->816|2476->825
                    LINES: 41->13|46->18|46->18|47->13|49->17|50->18|52->20|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|54->22|54->22|54->22|55->23
                    -- GENERATED --
                */
            