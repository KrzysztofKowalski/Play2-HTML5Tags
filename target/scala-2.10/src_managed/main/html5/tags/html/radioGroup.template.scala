
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
object radioGroup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[play.api.data.Field,Seq[scala.Tuple2[String, String]],Array[scala.Tuple2[Symbol, Any]],views.html.helper.FieldConstructor,play.api.i18n.Lang,play.api.templates.HtmlFormat.Appendable] {

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
    def apply/*18.2*/(field: play.api.data.Field, options: Seq[(String,String)], args: (Symbol,Any)*)(implicit handler: views.html.helper.FieldConstructor, lang: play.api.i18n.Lang):play.api.templates.HtmlFormat.Appendable = {
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
    
    def render(field:play.api.data.Field,options:Seq[scala.Tuple2[String, String]],args:Array[scala.Tuple2[Symbol, Any]],handler:views.html.helper.FieldConstructor,lang:play.api.i18n.Lang): play.api.templates.HtmlFormat.Appendable = apply(field,options,args:_*)(handler,lang)
    
    def f:((play.api.data.Field,Seq[scala.Tuple2[String, String]],Array[scala.Tuple2[Symbol, Any]]) => (views.html.helper.FieldConstructor,play.api.i18n.Lang) => play.api.templates.HtmlFormat.Appendable) = (field,options,args) => (handler,lang) => apply(field,options,args:_*)(handler,lang)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 26 17:52:23 CEST 2013
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/radioGroup.scala.html
                    HASH: 11e009a93e24d903bf985c19e473c74db8c2b72b
                    MATRIX: 1547->429|1873->589|1902->662|1939->664|1969->685|2040->718|2108->750|2132->752|2175->760|2191->767|2204->771|2249->778|2317->810|2343->814|2381->816|2391->817|2416->820|2461->829|2487->833|2533->843|2543->844|2568->847|2607->850|2673->893|2712->895|2755->915|2794->917|2818->931|2861->951|2918->972|2944->976|2982->978|2992->979|3017->982|3056->985|3066->986|3091->989|3136->1003|3179->1015
                    LINES: 51->18|57->18|59->22|60->23|60->23|60->23|61->24|61->24|62->25|62->25|62->25|62->25|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|63->26|64->27|64->27|64->27|64->27|64->27|64->27|64->27|64->27|65->28|67->30
                    -- GENERATED --
                */
            