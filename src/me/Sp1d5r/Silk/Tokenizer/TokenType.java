package me.Sp1d5r.Silk.Tokenizer;

public enum TokenType {

	/** Absolutely nothing. */
	EMPTY,
	
	/** A token. For example, ( ) = , */
	TOKEN,
	
	/** First character is a letter, any proceeding characters are letters or numbers. */
	IDENTIFIER,
	
	/** A number. */
	INTEGER_LITERAL,
	
	/** Anything enclosed in double quotes. "Hello" "1" */
	STRING_LITERAL
}