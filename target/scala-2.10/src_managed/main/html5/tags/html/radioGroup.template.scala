
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
 * Generate an HTML radio group
 *
 * Example:
 * {{{
 * @inputRadioGroup(
 *           contactForm("gender"),
 *           options = Seq("M"->"Male","F"->"Female"),
 *           '_label -> "Gender",
 *           '_error -> contactForm("gender").error.map(_.withMessage("select gender")))
 *
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra HTML attributes.
 * @param handler The field constructor.
 */
object radioGroup extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template5[play.api.data.Field,Seq[scala.Tuple2[String, String]],Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.Html] {

    /**
 * Generate an HTML radio group
 *
 * Example:
 * {{{
 * @inputRadioGroup(
 *           contactForm("gender"),
 *           options = Seq("M"->"Male","F"->"Female"),
 *           '_label -> "Gender",
 *           '_error -> contactForm("gender").error.map(_.withMessage("select gender")))
 *
 * }}}
 *
 * @param field The form field.
 * @param args Set of extra HTML attributes.
 * @param handler The field constructor.
 */
    def apply/*18.2*/(field: play.api.data.Field, options: Seq[(String,String)], args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.Html = {
        _display_ {import html5.templates.Html5Templates

import views.html.helper.input


Seq[Any](format.raw/*18.162*/("""

"""),format.raw/*22.1*/("""
"""),_display_(Seq[Any](/*23.2*/input(field, args:_*)/*23.23*/ { (id, name, value, htmlArgs) =>_display_(Seq[Any](format.raw/*23.56*/("""
  <span class="buttonset" id=""""),_display_(Seq[Any](/*24.32*/id)),format.raw/*24.34*/("""">
    """),_display_(Seq[Any](/*25.6*/options/*25.13*/.map/*25.17*/ { v =>_display_(Seq[Any](format.raw/*25.24*/("""
      <input type="radio" id=""""),_display_(Seq[Any](/*26.32*/(id))),format.raw/*26.36*/("""_"""),_display_(Seq[Any](/*26.38*/v/*26.39*/._1)),format.raw/*26.42*/("""" name=""""),_display_(Seq[Any](/*26.51*/name)),format.raw/*26.55*/("""" value=""""),_display_(Seq[Any](/*26.65*/v/*26.66*/._1)),format.raw/*26.69*/("""" """),_display_(Seq[Any](/*26.72*/(if(value == Some(v._1)) "checked" else ""))),format.raw/*26.115*/(""" """),_display_(Seq[Any](/*26.117*/toHtmlArgs(htmlArgs))),format.raw/*26.137*/(""" """),_display_(Seq[Any](/*26.139*/Html5Templates/*26.153*/.toValidation(field))),format.raw/*26.173*/(""">
      <label for=""""),_display_(Seq[Any](/*27.20*/(id))),format.raw/*27.24*/("""_"""),_display_(Seq[Any](/*27.26*/v/*27.27*/._1)),format.raw/*27.30*/("""">"""),_display_(Seq[Any](/*27.33*/v/*27.34*/._2)),format.raw/*27.37*/("""</label>
    """)))})),format.raw/*28.6*/("""
  </span>
""")))})),format.raw/*30.2*/("""
"""))}
    }
    
    def render(field:play.api.data.Field,options:Seq[scala.Tuple2[String, String]],args:Array[scala.Tuple2[Symbol, Any]],handler:views.html.helper.FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.Html = apply(field,options,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Seq[scala.Tuple2[String, String]],Array[scala.Tuple2[Symbol, Any]]) => (views.html.helper.FieldConstructor,play.api.i18n.Lang) => play.api.templates.Html) = (field,options,args) => (handler,lang) => apply(field,options,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 19 15:46:08 CEST 2013
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/radioGroup.scala.html
                    HASH: b27583164fa869696c875a55a6f40fa5dcb72ba6
                    MATRIX: 1496->429|1805->589|1834->662|1871->664|1901->685|1972->718|2040->750|2064->752|2107->760|2123->767|2136->771|2181->778|2249->810|2275->814|2313->816|2323->817|2348->820|2393->829|2419->833|2465->843|2475->844|2500->847|2539->850|2605->893|2644->895|2687->915|2726->917|2750->931|2793->951|2850->972|2876->976|2914->978|2924->979|2949->982|2988->985|2998->986|3023->989|3068->1003|3111->1015
                    LINES: 51->18|57->18|59->22|60->23|60->23|60->23|61->24|61->24|62->25|62->25|62->25|62->25|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|64->27|64->27|64->27|64->27|64->27|64->27|64->27|64->27|65->28|67->30
                    -- GENERATED --
                */
            