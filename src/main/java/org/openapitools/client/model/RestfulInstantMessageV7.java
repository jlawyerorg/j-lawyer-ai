/*
 * j-lawyer-io
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.RestfulInstantMessageMentionV7;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * RestfulInstantMessageV7
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T23:02:59.563495701+01:00[Europe/Berlin]")
public class RestfulInstantMessageV7 {
  public static final String SERIALIZED_NAME_CASE_CONTEXT = "caseContext";
  @SerializedName(SERIALIZED_NAME_CASE_CONTEXT)
  private java.lang.String caseContext;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private java.lang.String content;

  public static final String SERIALIZED_NAME_DOCUMENT_CONTEXT = "documentContext";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_CONTEXT)
  private java.lang.String documentContext;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private java.lang.String id;

  public static final String SERIALIZED_NAME_MENTIONS = "mentions";
  @SerializedName(SERIALIZED_NAME_MENTIONS)
  private List<RestfulInstantMessageMentionV7> mentions;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private java.lang.String sender;

  public static final String SERIALIZED_NAME_SENT = "sent";
  @SerializedName(SERIALIZED_NAME_SENT)
  private Object sent;

  public RestfulInstantMessageV7() {
  }

  public RestfulInstantMessageV7 caseContext(java.lang.String caseContext) {
    
    this.caseContext = caseContext;
    return this;
  }

   /**
   * Get caseContext
   * @return caseContext
  **/
  @javax.annotation.Nullable
  public java.lang.String getCaseContext() {
    return caseContext;
  }


  public void setCaseContext(java.lang.String caseContext) {
    this.caseContext = caseContext;
  }


  public RestfulInstantMessageV7 content(java.lang.String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  public java.lang.String getContent() {
    return content;
  }


  public void setContent(java.lang.String content) {
    this.content = content;
  }


  public RestfulInstantMessageV7 documentContext(java.lang.String documentContext) {
    
    this.documentContext = documentContext;
    return this;
  }

   /**
   * Get documentContext
   * @return documentContext
  **/
  @javax.annotation.Nullable
  public java.lang.String getDocumentContext() {
    return documentContext;
  }


  public void setDocumentContext(java.lang.String documentContext) {
    this.documentContext = documentContext;
  }


  public RestfulInstantMessageV7 id(java.lang.String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public java.lang.String getId() {
    return id;
  }


  public void setId(java.lang.String id) {
    this.id = id;
  }


  public RestfulInstantMessageV7 mentions(List<RestfulInstantMessageMentionV7> mentions) {
    
    this.mentions = mentions;
    return this;
  }

  public RestfulInstantMessageV7 addMentionsItem(RestfulInstantMessageMentionV7 mentionsItem) {
    if (this.mentions == null) {
      this.mentions = new ArrayList<>();
    }
    this.mentions.add(mentionsItem);
    return this;
  }

   /**
   * Get mentions
   * @return mentions
  **/
  @javax.annotation.Nullable
  public List<RestfulInstantMessageMentionV7> getMentions() {
    return mentions;
  }


  public void setMentions(List<RestfulInstantMessageMentionV7> mentions) {
    this.mentions = mentions;
  }


  public RestfulInstantMessageV7 sender(java.lang.String sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @javax.annotation.Nullable
  public java.lang.String getSender() {
    return sender;
  }


  public void setSender(java.lang.String sender) {
    this.sender = sender;
  }


  public RestfulInstantMessageV7 sent(Object sent) {
    
    this.sent = sent;
    return this;
  }

   /**
   * Get sent
   * @return sent
  **/
  @javax.annotation.Nullable
  public Object getSent() {
    return sent;
  }


  public void setSent(Object sent) {
    this.sent = sent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestfulInstantMessageV7 restfulInstantMessageV7 = (RestfulInstantMessageV7) o;
    return Objects.equals(this.caseContext, restfulInstantMessageV7.caseContext) &&
        Objects.equals(this.content, restfulInstantMessageV7.content) &&
        Objects.equals(this.documentContext, restfulInstantMessageV7.documentContext) &&
        Objects.equals(this.id, restfulInstantMessageV7.id) &&
        Objects.equals(this.mentions, restfulInstantMessageV7.mentions) &&
        Objects.equals(this.sender, restfulInstantMessageV7.sender) &&
        Objects.equals(this.sent, restfulInstantMessageV7.sent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseContext, content, documentContext, id, mentions, sender, sent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestfulInstantMessageV7 {\n");
    sb.append("    caseContext: ").append(toIndentedString(caseContext)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    documentContext: ").append(toIndentedString(documentContext)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("caseContext");
    openapiFields.add("content");
    openapiFields.add("documentContext");
    openapiFields.add("id");
    openapiFields.add("mentions");
    openapiFields.add("sender");
    openapiFields.add("sent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RestfulInstantMessageV7
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RestfulInstantMessageV7.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RestfulInstantMessageV7 is not found in the empty JSON string", RestfulInstantMessageV7.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RestfulInstantMessageV7.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RestfulInstantMessageV7` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("caseContext") != null && !jsonObj.get("caseContext").isJsonNull()) && !jsonObj.get("caseContext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseContext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseContext").toString()));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("documentContext") != null && !jsonObj.get("documentContext").isJsonNull()) && !jsonObj.get("documentContext").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentContext` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentContext").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("mentions") != null && !jsonObj.get("mentions").isJsonNull()) {
        JsonArray jsonArraymentions = jsonObj.getAsJsonArray("mentions");
        if (jsonArraymentions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mentions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mentions` to be an array in the JSON string but got `%s`", jsonObj.get("mentions").toString()));
          }

          // validate the optional field `mentions` (array)
          for (int i = 0; i < jsonArraymentions.size(); i++) {
            RestfulInstantMessageMentionV7.validateJsonElement(jsonArraymentions.get(i));
          };
        }
      }
      if ((jsonObj.get("sender") != null && !jsonObj.get("sender").isJsonNull()) && !jsonObj.get("sender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sender").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RestfulInstantMessageV7.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RestfulInstantMessageV7' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RestfulInstantMessageV7> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RestfulInstantMessageV7.class));

       return (TypeAdapter<T>) new TypeAdapter<RestfulInstantMessageV7>() {
           @Override
           public void write(JsonWriter out, RestfulInstantMessageV7 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RestfulInstantMessageV7 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RestfulInstantMessageV7 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RestfulInstantMessageV7
  * @throws IOException if the JSON string is invalid with respect to RestfulInstantMessageV7
  */
  public static RestfulInstantMessageV7 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RestfulInstantMessageV7.class);
  }

 /**
  * Convert an instance of RestfulInstantMessageV7 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

