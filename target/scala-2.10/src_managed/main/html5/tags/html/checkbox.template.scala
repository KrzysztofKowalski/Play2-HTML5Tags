
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
object checkbox extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[play.api.data.Field,Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

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
    def apply/*13.2*/(field: play.api.data.Field, args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.Html = {
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
    
    def render(field:play.api.data.Field,args:Array[scala.Tuple2[Symbol, Any]],handler:views.html.helper.FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Array[scala.Tuple2[Symbol, Any]]) => (views.html.helper.FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,args) => (handler,lang) => apply(field,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 19 15:46:07 CEST 2013
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/checkbox.scala.html
                    HASH: b2de317818dd2989def320a1791d37fc4129500a
                    MATRIX: 1168->283|1411->470|1428->478|1508->412|1537->468|1566->526|1604->529|1634->550|1705->583|1774->616|1798->618|1843->627|1869->631|1915->641|1945->649|1984->652|2054->699|2093->701|2160->745|2199->747|2223->761|2266->781|2315->794|2328->798|2368->816|2408->825
                    LINES: 41->13|46->18|46->18|47->13|49->17|50->18|52->20|52->20|52->20|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|53->21|54->22|54->22|54->22|55->23
                    -- GENERATED --
                */
            