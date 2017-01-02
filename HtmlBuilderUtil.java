/**
 * 
 */
package com.samples;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.formsandinputs.Button;
import com.webfirmframework.wffweb.tag.html.html5.stylesandsemantics.Section;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.Div;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

/**
 * @author 20123671
 *
 */
public class HtmlBuilderUtil {
	public static void main(String[] arg) {
		HtmlBuilderUtil ff = new HtmlBuilderUtil();
		Html html = ff.htmlTagCreator();
		ff.headTagCreator(html);
		Body body = ff.bodyTagCreator(html);
		Div div = new Div(body, null);
		Button button = new Button(div, null);
		NoTag notag = ff.noTagCreator(div, "Hello World");
		div.addAttributes();
	
		
		
		
		
		System.out.println(html.toHtmlString());
		
	
		
	}

	/**
	 * this program is to add on html conversion code
	 * 
	 * @Jar wffweb-2.1.3 is mandate for this program
	 * 
	 */
	
	
	/**
	 * Html tag creator
	 * */
	public Html htmlTagCreator() {
		Html html = new Html(null);
		html.setPrependDocType(true);
		return html;
	}
	
	public Head headTagCreator(Html html) {
		return new Head(html);
	}
	
	public Body bodyTagCreator(Html html) {
		return new Body(html);
	}
	
	public Div divTagCreator(Object object) {
		if(object instanceof Body){
			return new Div((Body)object, null);
		}else if(object instanceof Div){
			return new Div((Div)object, null);
		}
		return new Div(null, null);
	}
	
	/**
	 * Custom tag container to hold components
	 * @param object
	 * @param content
	 * 
	 * @return NoTag object
	 * */
	public NoTag noTagCreator(Object object, String content) {
		if(object instanceof Body){
			return new NoTag((Body)object, content);
		}else if(object instanceof Div){
			return new NoTag((Div)object, content);
		}
		return new NoTag((Body)object, content);
	}
	
	

}
