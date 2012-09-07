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

import com.intellij.lang.ASTNode;

/**
 * ProtoElement that encapsulates the lower bound value in an extensions statement. For instance,
 * the value "100" in the following example :-
 *
 * extensions 100 to 199;
 */
public class ProtoExtensionsLowerBound extends AbstractProtoElement {

  public ProtoExtensionsLowerBound(ASTNode astNode) {
    super(astNode);
  }
}
