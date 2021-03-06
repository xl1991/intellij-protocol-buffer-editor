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

package com.google.protoeditor.structureview;

import com.intellij.ide.structureView.StructureViewBuilder;
import com.intellij.lang.PsiStructureViewFactory;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.Nullable;

/**
 * A factory providing {@link com.intellij.ide.structureView.StructureViewBuilder}
 * instance for PROTO language registered in {@code plugin.xml}
 */
public class ProtoStructureViewBuilderFactory  implements PsiStructureViewFactory {
  @Nullable
  public StructureViewBuilder getStructureViewBuilder(final PsiFile psiFile) {
    return new ProtoStructureViewBuilder(psiFile);
  }
}
