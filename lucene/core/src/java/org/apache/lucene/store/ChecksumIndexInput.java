package org.apache.lucene.store;

import java.io.IOException;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/** 
 * Extension of IndexInput, computing checksum as it goes. 
 * Callers can retrieve the checksum via {@link #getChecksum()}.
 */
public abstract class ChecksumIndexInput extends IndexInput {
  
  /** resourceDescription should be a non-null, opaque string
   *  describing this resource; it's returned from
   *  {@link #toString}. */
  protected ChecksumIndexInput(String resourceDescription) {
    super(resourceDescription);
  }

  /** Returns the current checksum value */
  public abstract long getChecksum() throws IOException;

  @Override
  public void seek(long pos) {
    throw new UnsupportedOperationException();
  }
}
