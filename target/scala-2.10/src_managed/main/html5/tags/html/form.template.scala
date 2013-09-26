
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
 * Generate an HTML form.
 *
 * Example:
 * {{{
 * @form(action = routes.Users.submit, args = 'class -> "myForm") {
 *   ...
 * }
 * }}}
 *
 * @param action The submit action.
 * @param args Set of extra HTML attributes.
 * @param body The form body.
 */
object form extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[play.api.mvc.Call,Array[scala.Tuple2[Symbol, String]],Html,play.api.templates.HtmlFormat.Appendable] {

    /**
 * Generate an HTML form.
 *
 * Example:
 * {{{
 * @form(action = routes.Users.submit, args = 'class -> "myForm") {
 *   ...
 * }
 * }}}
 *
 * @param action The submit action.
 * @param args Set of extra HTML attributes.
 * @param body The form body.
 */
    def apply/*15.2*/(action: play.api.mvc.Call, args: (Symbol,String)*)(body: => Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*15.68*/(""" 

<form action=""""),_display_(Seq[Any](/*17.16*/action/*17.22*/.url)),format.raw/*17.26*/("""" method=""""),_display_(Seq[Any](/*17.37*/action/*17.43*/.method)),format.raw/*17.50*/("""" """),_display_(Seq[Any](/*17.53*/toHtmlArgs(args.toMap))),format.raw/*17.75*/(""">
    """),_display_(Seq[Any](/*18.6*/body)),format.raw/*18.10*/("""
</form>
"""))}
    }
    
    def render(action:play.api.mvc.Call,args:Array[scala.Tuple2[Symbol, String]],body:Html): play.api.templates.HtmlFormat.Appendable = apply(action,args:_*)(body)
    
    def f:((play.api.mvc.Call,Array[scala.Tuple2[Symbol, String]]) => ( => Html) => play.api.templates.HtmlFormat.Appendable) = (action,args) => (body) => apply(action,args:_*)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 26 17:52:23 CEST 2013
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/form.scala.html
                    HASH: a1c0532490104f7548e7e096d3601be3a8afdf17
                    MATRIX: 1121->260|1282->326|1336->344|1351->350|1377->354|1424->365|1439->371|1468->378|1507->381|1551->403|1593->410|1619->414
                    LINES: 45->15|48->15|50->17|50->17|50->17|50->17|50->17|50->17|50->17|50->17|51->18|51->18
                    -- GENERATED --
                */
            