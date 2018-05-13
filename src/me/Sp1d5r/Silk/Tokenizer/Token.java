package me.Sp1d5r.Silk.Tokenizer;

import me.Sp1d5r.Silk.Tokenizer.TokenType;

public class Token {

	private String token;
	private TokenType type;
	
	public Token(String token, TokenType type) {
		this.token = token;
		this.type = type;
	}
	
	public String getToken() {
		return token;
	}
	
	public TokenType getType() {
		return type;
	}
}