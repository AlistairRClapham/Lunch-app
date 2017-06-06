
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object welcome_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class welcome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(greeting:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome!")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
"""),format.raw/*4.1*/("""<h1>"""),_display_(/*4.6*/greeting),format.raw/*4.14*/("""</h1>
""")))}))
      }
    }
  }

  def render(greeting:String): play.twirl.api.HtmlFormat.Appendable = apply(greeting)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (greeting) => apply(greeting)

  def ref: this.type = this

}


}

/**/
object welcome extends welcome_Scope0.welcome
              /*
                  -- GENERATED --
                  DATE: Tue Jun 06 14:19:48 BST 2017
                  SOURCE: /home/alistair/lunch-app/app/views/welcome.scala.html
                  HASH: c69277baed4b982ee039a4a9d24aca8028cb58d3
                  MATRIX: 531->1|643->18|671->21|695->37|734->39|761->40|791->45|819->53
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|28->4|28->4
                  -- GENERATED --
              */
          