package com.example.demo.test01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.html2pdf.HtmlConverter;

public class App 
{
	public static final String HTML = "<h1>Hello</h1>"
			+ "<p>This was created using iText</p>"
			+ "<p> <img src=\"http://144.34.158.170:999/cashlenaFooter.png\" alt=\"\" /> </p>"
			+ "<a href='hmkcode.com'>hmkcode.com</a>";
	
	
    public static void main( String[] args ) throws FileNotFoundException, IOException  
    {
    	HtmlConverter.convertToPdf(HTML, new FileOutputStream("string-to-pdf.pdf"));
    	
        System.out.println( "PDF Created!" );
    }
}