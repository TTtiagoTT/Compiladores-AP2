import java.io.IOException;
import java.util.HashMap;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Main {

	public static void main(String[] args) throws IOException {
		CharStream cs = CharStreams.fromFileName("programa1.gyh");
		GYH_LANGLexer lexer = new GYH_LANGLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GYH_LANGParser parser = new GYH_LANGParser(tokens);
		parser.programa();

		/*
		 * Token t;
		
		while((t=lexer.nextToken()).getType()!= Token.EOF) {
			System.out.println("<"+ GYH_LANGParser.VOCABULARY.getDisplayName(t.getType()) +","+ t.getText() +">");
		}
		 */
	}

	
	 
	HashMap<Integer, String> carro = new HashMap<Integer, String>();

}
 