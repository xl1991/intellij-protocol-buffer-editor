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

import java.util.List;

public class ProtoServiceBody
    extends AbstractProtoElement implements ProtoOptionsHolder {

  public ProtoServiceBody(ASTNode astNode) {
    super(astNode);
  }

  public List<ProtoOption> getOptions() {
    return ProtoPsiTools.findDirectChildrenOfType(this, ProtoOption.class);
  }

  public List<ProtoRpcDefinition> getRpcDefinitions() {
    return ProtoPsiTools.findDirectChildrenOfType(this, ProtoRpcDefinition.class);
  }
}
