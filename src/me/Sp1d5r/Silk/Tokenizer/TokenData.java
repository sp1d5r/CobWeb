package me.Sp1d5r.Silk.Tokenizer;

import java.util.regex.Pattern;

import me.Sp1d5r.Silk.Tokenizer.TokenType;

public class TokenData {

	private Pattern pattern;
	private TokenType type;
	
	public TokenData(Pattern pattern, TokenType type) {
		this.pattern = pattern;
		this.type = type;
	}
	
	public Pattern getPattern() {
		return pattern;
	}
	
	public TokenType getType() {
		return type;
	}
}