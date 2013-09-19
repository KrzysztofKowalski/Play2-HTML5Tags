
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
object form extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[play.api.mvc.Call,Array[scala.Tuple2[Symbol, String]],Html,play.api.templates.Html] {

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
    def apply/*15.2*/(action: play.api.mvc.Call, args: (Symbol,String)*)(body: => Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*15.68*/(""" 

<form action=""""),_display_(Seq[Any](/*17.16*/action/*17.22*/.url)),format.raw/*17.26*/("""" method=""""),_display_(Seq[Any](/*17.37*/action/*17.43*/.method)),format.raw/*17.50*/("""" """),_display_(Seq[Any](/*17.53*/toHtmlArgs(args.toMap))),format.raw/*17.75*/(""">
    """),_display_(Seq[Any](/*18.6*/body)),format.raw/*18.10*/("""
</form>
"""))}
    }
    
    def render(action:play.api.mvc.Call,args:Array[scala.Tuple2[Symbol, String]],body:Html): play.api.templates.Html = apply(action,args:_*)(body)
    
    def f:((play.api.mvc.Call,Array[scala.Tuple2[Symbol, String]]) => ( => Html) => play.api.templates.Html) = (action,args) => (body) => apply(action,args:_*)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Sep 19 15:46:07 CEST 2013
                    SOURCE: /home/k/workspace/Play2-HTML5Tags/app/html5/tags/form.scala.html
                    HASH: ce2a89550b5b6c4ce329220182f4efab1bea8424
                    MATRIX: 1070->260|1214->326|1268->344|1283->350|1309->354|1356->365|1371->371|1400->378|1439->381|1483->403|1525->410|1551->414
                    LINES: 45->15|48->15|50->17|50->17|50->17|50->17|50->17|50->17|50->17|50->17|51->18|51->18
                    -- GENERATED --
                */
            