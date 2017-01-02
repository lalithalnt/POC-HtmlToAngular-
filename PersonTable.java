package com.samples;

import com.webfirmframework.wffweb.tag.html.Body;
import com.webfirmframework.wffweb.tag.html.Br;
import com.webfirmframework.wffweb.tag.html.H1;
import com.webfirmframework.wffweb.tag.html.H2;
import com.webfirmframework.wffweb.tag.html.Hr;
import com.webfirmframework.wffweb.tag.html.Html;
import com.webfirmframework.wffweb.tag.html.metainfo.Head;
import com.webfirmframework.wffweb.tag.html.stylesandsemantics.StyleTag;
import com.webfirmframework.wffweb.tag.html.tables.TBody;
import com.webfirmframework.wffweb.tag.html.tables.Table;
import com.webfirmframework.wffweb.tag.html.tables.Td;
import com.webfirmframework.wffweb.tag.html.tables.Th;
import com.webfirmframework.wffweb.tag.html.tables.Tr;
import com.webfirmframework.wffweb.tag.htmlwff.Blank;
import com.webfirmframework.wffweb.tag.htmlwff.NoTag;

public class PersonTable {
	public void displayTable()
	{
		Html html=new Html(null){
			Head head=new Head(this)
					{
				StyleTag st=new StyleTag(this)
    			{
    		NoTag nt=new NoTag(this,"body{background:pink;}table{align:center;border-collapse:collapse;width:60%;}td,tr{border:1px solid grey;padding:8px;}"
    				+ "h1{color:grey;text-align:center;}tr:nth-child(even){background-color:lightgrey;}");
    			};//style
					};//head
			Body body=new Body(this){
				Br br=new Br(this);
				H1 h1=new H1(this){
	        		Blank h1=new Blank(this,"Person Data");
	        	};
				Br br1=new Br(this);
				Hr hr=new Hr(this);
				Table table=new Table(this){
					TBody tbody=new TBody(this){
						Tr tr1=new Tr(this){
							Th fullname=new Th(this){
								NoTag fullname=new NoTag(this,"FullName");
							};//th
							Th address=new Th(this){
								NoTag address=new NoTag(this,"Address");
							};//th
							Th phone=new Th(this){
								NoTag phone=new NoTag(this,"Phone");
							};//th
						};//tr
						Tr tr2=new Tr(this){
							Td fullname=new Td(this){
								NoTag fullname=new NoTag(this,"Saritha");
							};//th
							Td address=new Td(this){
								NoTag address=new NoTag(this,"Hyderabad");
							};//th
							Td phone=new Td(this){
								NoTag phone=new NoTag(this,"9856231245");
							};//th
						};//tr
						Tr tr3=new Tr(this){
							Td fullname=new Td(this){
								NoTag fullname=new NoTag(this,"Harika");
							};//th
							Td address=new Td(this){
								NoTag address=new NoTag(this,"Chennai");
							};//th
							Td phone=new Td(this){
								NoTag phone=new NoTag(this,"9856212245");
							};//th
						};//tr
						Tr tr4=new Tr(this){
							Td fullname=new Td(this){
								NoTag fullname=new NoTag(this,"Manasa");
							};//th
							Td address=new Td(this){
								NoTag address=new NoTag(this,"Hyderabad");
							};//th
							Td phone=new Td(this){
								NoTag phone=new NoTag(this,"8556231249");
							};//th
						};//tr
					};//tbody
				};//table
			};//body
		};//html




		// prepends the doc type <!DOCTYPE html>
		html.setPrependDocType(true);
		System.out.println(html.toHtmlString()); 

			}//displaytable() method

			public static void main(String args[])
			{
				PersonTable pt=new PersonTable();
				pt.displayTable();
			}//main method
		}//class


