// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface TesboTypes {

  IElementType PROPERTY = new TestElementType("PROPERTY");

  IElementType COMMENT = new TestTokenType("COMMENT");
  IElementType CRLF = new TestTokenType("CRLF");
  IElementType KEY = new TestTokenType("KEY");
  IElementType SEPARATOR = new TestTokenType("SEPARATOR");
  IElementType VALUE = new TestTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new TesboPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
