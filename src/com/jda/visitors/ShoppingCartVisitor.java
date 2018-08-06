
package com.jda.visitors;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
