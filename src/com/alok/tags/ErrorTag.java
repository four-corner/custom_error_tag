package com.alok.tags;

import java.io.Writer;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import sun.font.LayoutPathImpl.EndType;

public class ErrorTag extends TagSupport {
	private String property;

	public void setProperty(String property) {
		this.property = property;
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		try {
			Object msg = pageContext.findAttribute(property);
			System.out.println(msg);
			if (msg != null) {
				Writer out = pageContext.getOut();
				out.write("<font color='red' size='4'>" + msg + "</font>");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return super.doEndTag();
	}

}
