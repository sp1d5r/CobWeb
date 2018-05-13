package me.Sp1d5r.Silk;

import me.Sp1d5r.Silk.BuiltInType;
import me.Sp1d5r.Silk.Type;

public interface Type {

	public static Type match(String str) {
		try {
			return BuiltInType.valueOf(str.toUpperCase());
		}
		
		catch (Exception e) {
			// TODO: Match str to a class.
			return null;
		}
	}
}