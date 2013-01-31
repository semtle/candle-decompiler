package org.candle.decompiler.ast.conditional;

import java.io.IOException;
import java.io.Writer;

import org.candle.decompiler.intermediate.code.ConditionalIntermediate;

public class ElseIfBlock extends IfBlock {

	public ElseIfBlock(ConditionalIntermediate conditional) {
		super(conditional);
	}

	@Override
	public void write(Writer writer) throws IOException {
		writer.append("else ");
		super.write(writer);
	}
}
