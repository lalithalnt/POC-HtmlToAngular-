package com.samples;

import com.webfirmframework.wffweb.interpreter.CodeExecutor;
import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Br;
import com.webfirmframework.wffweb.tag.html.H1;
import com.webfirmframework.wffweb.tag.html.H2;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.attribute.Type;
import com.webfirmframework.wffweb.tag.html.attribute.Value;
import com.webfirmframework.wffweb.tag.html.attribute.event.mouse.OnClick;
import com.webfirmframework.wffweb.tag.html.attribute.global.Style;
import com.webfirmframework.wffweb.tag.html.attributewff.CustomAttribute;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Button;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Input;
import com.webfirmframework.wffweb.tag.html.html5.attribute.global.Hidden;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.html.programming.Script;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.Div;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.StyleTag;
import com.webfirmframework.wffweb.tag.htmlwff.Blank;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

public class HelloWorldButton{
	public void button()
	{
		Html html = new Html(null) {

            Head head = new Head(this)
            		{
            	StyleTag st=new StyleTag(this)
            			{
            		NoTag nt=new NoTag(this,"body{background-color:pink;}h2{color:brown;}");
            			};
            	Script sc=new Script(this)
            			{
            		NoTag nt=new NoTag(this,"function hello(){alert(\"success\");document.write(\"Haii Welcome...\");}");
            		
            			};
            		};

            Body body = new Body(this,new OnClick("return hello()")) {
            	
            	
               H2 h2=new H2(this)
            		   {
            	   NoTag nt1=new NoTag(this,"Haiii Good Day....");
            		   };
            		   Br br=new Br(this);
            		  Input input= new Input(this,
            					new Type("submit"),
            					new Value("Clcik"));

            };
            };


// prepends the doc type <!DOCTYPE html>
html.setPrependDocType(true);
System.out.println(html.toHtmlString()); 

	}
	public static void main(String args[])
	{
		HelloWorldButton hwb=new HelloWorldButton();
		hwb.button();
	}
}
