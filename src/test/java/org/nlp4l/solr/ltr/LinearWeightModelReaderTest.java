/*
 * Copyright 2016 org.NLP4L
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.nlp4l.solr.ltr;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinearWeightModelReaderTest {

  @Test
  public void testLoader() throws Exception {
    LinearWeightModelReader mcReader = new LinearWeightModelReader("linearweight_model.conf");
    LinearWeightModelReader.WeightDesc[] weightDescs = mcReader.getWeightDescs();
    assertEquals(4, weightDescs.length);
    assertEquals("name=TF in title,weight=3.0", weightDescs[0].toString());
    assertEquals("name=TF in body,weight=4.0", weightDescs[1].toString());
    assertEquals("name=IDF in title,weight=5.0", weightDescs[2].toString());
    assertEquals("name=IDF in body,weight=2.0", weightDescs[3].toString());
  }
}
