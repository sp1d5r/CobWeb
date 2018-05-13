package me.Sp1d5r.Silk.Blocks;

import me.Sp1d5r.Silk.Type;
import me.Sp1d5r.Silk.Blocks.Block;
import me.Sp1d5r.Silk.Blocks.Method;

/**
 * Represents a class.
 */
public class Class extends Block implements Type {
	
	private String name;

	public Class(String name) {
		super(null);
		
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void run() {
		for (Block b : getSubBlocks()) {
			if (b instanceof Method) {
				Method method = (Method) b;
				if (method.getName().equals("main") && method.getType().equals("void") && method.getParameters().length == 0) {
					method.run();
				}
			}
		}
	}
}