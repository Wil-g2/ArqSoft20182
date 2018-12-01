/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descoberta;

import java.io.File;
import java.util.List;
import util.GraphViz;

/**
 *
 * @author Willian
 */
public class Main {
    public static void main(String []args ){
        System.out.println("teste");
        //generate file DOT (graph description language)		
		
		//path of file 
		String path="F:\\Desenvolvimento\\Projetos\\ArqSoft20182\\SQLProject";
		
		//FileWriter file;
		try {			
			
			GraphViz gv = new GraphViz();
			gv.addln(gv.start_graph());		
			gv.addln("size =\"4,4\";");
                        gv.addln("main [shape=box]; /* this is a comment */");
                        gv.addln("main -> parse [weight=8];");
                        gv.addln("parse -> execute;");
                        gv.addln("main -> init [style=dotted];");
                        gv.addln("main -> cleanup;");
                        gv.addln("execute -> { make_string; printf}");
                        gv.addln("init -> make_string;");
                        gv.addln("edge [color=red]; // so is this");
                        gv.addln("main -> printf [style=bold,label=\"100 times\"];");
                        gv.addln("make_string [label=\"make a\\nstring\"];");
                        gv.addln("node [shape=box,style=filled,color=\".7 .3 1.0\"];");
			gv.addln("execute -> compare;");			
                        
			gv.add(gv.end_graph());						
			//out of file .dot 
			System.out.println("========= Start Copy ========");
			System.out.println(gv.getDotSource());
			System.out.println("========= End Copy ========");
			gv.increaseDpi();
			
			//Type file
			String type = "png";
			//File out = new File(+gv.getImageDpi()+"."+ type);   // Linux			
                        File out = new File(path+"\\"+gv.getImageDpi()+"."+ type);
                        //File out = new File(path+"."+ type);    // Windows
			gv.writeGraphToFile( gv.getGraph(gv.getDotSource(),type,"dot"), out );
							
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public void gerarArq(String classe, String line, String qtdatributos, List<String>metodos, List<String>attributes, String getCountMet) {			
		//generate file DOT (graph description language)		
		
		//path of file 
		String path="F:\\";
		
		//FileWriter file;
		try {			
			
			GraphViz gv = new GraphViz();
			gv.addln(gv.start_graph());		
			gv.addln("size =\"4,4\";");
                        gv.addln("main [shape=box]; /* this is a comment */");
                        gv.addln("main -> parse [weight=8];");
                        gv.addln("parse -> execute;");
                        gv.addln("main -> init [style=dotted];");
                        gv.addln("main -> cleanup;");
                        gv.addln("execute -> { make_string; printf}");
                        gv.addln("init -> make_string;");
                        gv.addln("edge [color=red]; // so is this");
                        gv.addln("main -> printf [style=bold,label=\"100 times\"];");
                        gv.addln("make_string [label=\"make a\\nstring\"];");
                        gv.addln("node [shape=box,style=filled,color=\".7 .3 1.0\"];");
			gv.addln("execute -> compare;");			
                        
			gv.add(gv.end_graph());						
			//out of file .dot 
			System.out.println("========= Start Copy ========");
			System.out.println(gv.getDotSource());
			System.out.println("========= End Copy ========");
			gv.increaseDpi();
			
			//Type file
			String type = "png";
			//File out = new File(+gv.getImageDpi()+"."+ type);   // Linux
			File out = new File(path+"."+ type);    // Windows
			gv.writeGraphToFile( gv.getGraph(gv.getDotSource(),type,"dot"), out );
							
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
