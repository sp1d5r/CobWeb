package me.Sp1d5r.Silk.Parser;

import me.Sp1d5r.Silk.Blocks.Block;
import me.Sp1d5r.Silk.Tokenizer.Tokenizer;

public abstract class Parser<T extends Block> {

	/**
	 * Takes a line and checks to see if it is for this parser by using regex.
	 */
	public abstract boolean shouldParse(String line);
	
	/**
	 * Take the superBlock and the tokenizer for the line and return a block of this parser's type.
	 */
	public abstract T parse(Block superBlock, Tokenizer tokenizer);
}