/**
 * Copyright (C) 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.protoeditor.psi;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;

import org.jetbrains.annotations.Nullable;

public class ProtoNamedElementImpl extends AbstractProtoElement implements
                                                                ProtoElement, ProtoNamedElement {

  public ProtoNamedElementImpl(com.intellij.lang.ASTNode astNode) {
    super(astNode);
  }

  public ProtoNameElement getNameElement() {
    return ProtoPsiTools.findDirectChildOfType(this, ProtoNameElement.class);
  }

  public int getTextOffset() {
    ProtoNameElement nameElement = getNameElement();
    return nameElement == null ? super.getTextOffset() : nameElement.getTextOffset();
  }

  public
  @Nullable
  String getName() {
    ProtoNameElement nameElement = getNameElement();
    return nameElement == null ? null : nameElement.getName();
  }

  public PsiElement setName(String name) throws IncorrectOperationException {
    getNameElement().setName(name);
    return this;
  }

  public ItemPresentation getPresentation() {
    return new ProtoItemPresentation(this);
  }
}