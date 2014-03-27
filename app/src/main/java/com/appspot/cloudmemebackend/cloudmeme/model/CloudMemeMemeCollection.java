/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-02-14 18:40:25 UTC)
 * on 2014-03-17 at 22:35:45 UTC 
 * Modify at your own risk.
 */

package com.appspot.cloudmemebackend.cloudmeme.model;

/**
 * Collection of Memes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the cloudmeme. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudMemeMemeCollection extends com.google.api.client.json.GenericJson {

  /**
   * Meme stores the image url and text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CloudMemeMeme> items;

  /**
   * Meme stores the image url and text.
   * @return value or {@code null} for none
   */
  public java.util.List<CloudMemeMeme> getItems() {
    return items;
  }

  /**
   * Meme stores the image url and text.
   * @param items items or {@code null} for none
   */
  public CloudMemeMemeCollection setItems(java.util.List<CloudMemeMeme> items) {
    this.items = items;
    return this;
  }

  @Override
  public CloudMemeMemeCollection set(String fieldName, Object value) {
    return (CloudMemeMemeCollection) super.set(fieldName, value);
  }

  @Override
  public CloudMemeMemeCollection clone() {
    return (CloudMemeMemeCollection) super.clone();
  }

}
