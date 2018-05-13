package me.Sp1d5r.Silk.Blocks;

import me.Sp1d5r.Silk.BuiltInType;
import me.Sp1d5r.Silk.Type;
import me.Sp1d5r.Silk.Variable;

public class VariableBlock extends Block {

	private String type, name;
	private Object value;
	
	public VariableBlock(Block superBlock, String type, String name, Object value) {
		super(superBlock);
		
		this.type = type;
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void run() {
		Type t = Type.match(type);
		
		if (t == BuiltInType.VOID) {
			throw new IllegalStateException("Cannot declare variables of type void.");
		}
		
		getSuperBlock().addVariable(new Variable(getSuperBlock(), t, name, value));
	}
}