	package com.samples;

import com.webfirmframework.wffweb.interpreter.CodeExecutor;
import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Br;
import com.webfirmframework.wffweb.tag.html.H1;
import com.webfirmframework.wffweb.tag.html.H2;
import com.webfirmframework.wffweb.tag.html.H3;
import com.webfirmframework.wffweb.tag.html.Hr;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.P;
import com.webfirmframework.wffweb.tag.html.attribute.Href;
import com.webfirmframework.wffweb.tag.html.attribute.global.Style;
import com.webfirmframework.wffweb.tag.html.attributewff.CustomAttribute;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Button;
import com.webfirmframework.wffweb.tag.html.html5.attribute.global.Hidden;
import com.webfirmframework.wffweb.tag.html.html5.links.Nav;
import com.webfirmframework.wffweb.tag.html.links.A;
import com.webfirmframework.wffweb.tag.html.lists.Li;
import com.webfirmframework.wffweb.tag.html.lists.Ul;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.Div;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.Span;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.StyleTag;
import com.webfirmframework.wffweb.tag.htmlwff.Blank;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

public class AnchorLinks{
	public static void main(String args[])
	{
		Html html = new Html(null,new Style("background:grey;")) {
			

            Head head = new Head(this)
            		{
            	StyleTag st=new StyleTag(this)
    			{
    		NoTag nt=new NoTag(this,"body{background:grey;}a{color:lightcyan;text-decoration:none;display:inline;padding:5px 10px;margin-right:10px;}"
    				               + "ul{list-style-type:none;background:lightcyan;color:lightcyan;}"
    				                + "li{float:left;}h1,h3{text-align:center;color:lightcyan;}");
    			};//style
            		};//head

            Body body = new Body(this) {

            	Div div1=new Div(this)
            			{
            	H1 h1=new H1(this)
            			{
            	 Blank h1 = new Blank(this, "Welcome to Home Page");

            	 Hr hr=new Hr(this);
            			};//h1
            			};//div1
            

            Div div2 = new Div(this) {

                H3 h3 = new H3(this) {
                	
                    Blank h3 = new Blank(this,
                            "This is a Sample Example");
                };//h3
               
                
            };//div2
            	Nav nav=new Nav(this){
            		Span span=new Span(this){
            				A a1=new A(this,new Href("home")){
            					
            					NoTag home=new NoTag(this,"Home");
            				};//a1
            				
            				A a2=new A(this,new Href("about")){
            					
            					NoTag about=new NoTag(this,"About");
            				};//a2
            				
            				A a3=new A(this,new Href("gallery")){
            					
            					NoTag gallery=new NoTag(this,"Gallery");
            				};//a2
            				
            				A a4=new A(this,new Href("contactus")){
            					
            					NoTag contactus=new NoTag(this,"Contact Us");
            				};//a2
            				
            				
            			};//span
            			
            				
            			};//nav
            		 };//body
            	};//html
	
// prepends the doc type <!DOCTYPE html>
html.setPrependDocType(true);
System.out.println(html.toHtmlString()); 

	}//main
}//class
