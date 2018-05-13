package me.Sp1d5r.Silk.Parser;

import me.Sp1d5r.Silk.Blocks.Block;
import me.Sp1d5r.Silk.Blocks.Class;
import me.Sp1d5r.Silk.Tokenizer.Tokenizer;

public class ClassParser extends Parser<Class> {

	@Override
	public boolean shouldParse(String line) {
		return line.matches("class [a-zA-Z][a-zA-Z0-9]*");
	}

	@Override
	public Class parse(Block superBlock, Tokenizer tokenizer) {
		tokenizer.nextToken(); // Skip the class token.
		
		String name = tokenizer.nextToken().getToken(); // Get the string value of the next token.
		
		return new Class(name);
	}
}