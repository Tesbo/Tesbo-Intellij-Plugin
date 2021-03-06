// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.TesboTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class TesboPropertyImpl extends ASTWrapperPsiElement implements TesboProperty {

  public TesboPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TesboVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TesboVisitor) accept((TesboVisitor)visitor);
    else super.accept(visitor);
  }

}
