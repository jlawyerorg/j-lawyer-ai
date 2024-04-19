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
import java.util.Arrays;

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
 * RestfulFormEntryV1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T23:02:59.563495701+01:00[Europe/Berlin]")
public class RestfulFormEntryV1 {
  public static final String SERIALIZED_NAME_ENTRY_KEY = "entryKey";
  @SerializedName(SERIALIZED_NAME_ENTRY_KEY)
  private java.lang.String entryKey;

  public static final String SERIALIZED_NAME_FORM_ID = "formId";
  @SerializedName(SERIALIZED_NAME_FORM_ID)
  private java.lang.String formId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private java.lang.String id;

  public static final String SERIALIZED_NAME_PLACE_HOLDER = "placeHolder";
  @SerializedName(SERIALIZED_NAME_PLACE_HOLDER)
  private java.lang.String placeHolder;

  public static final String SERIALIZED_NAME_STRING_VALUE = "stringValue";
  @SerializedName(SERIALIZED_NAME_STRING_VALUE)
  private java.lang.String stringValue;

  public RestfulFormEntryV1() {
  }

  public RestfulFormEntryV1 entryKey(java.lang.String entryKey) {
    
    this.entryKey = entryKey;
    return this;
  }

   /**
   * Get entryKey
   * @return entryKey
  **/
  @javax.annotation.Nullable
  public java.lang.String getEntryKey() {
    return entryKey;
  }


  public void setEntryKey(java.lang.String entryKey) {
    this.entryKey = entryKey;
  }


  public RestfulFormEntryV1 formId(java.lang.String formId) {
    
    this.formId = formId;
    return this;
  }

   /**
   * Get formId
   * @return formId
  **/
  @javax.annotation.Nullable
  public java.lang.String getFormId() {
    return formId;
  }


  public void setFormId(java.lang.String formId) {
    this.formId = formId;
  }


  public RestfulFormEntryV1 id(java.lang.String id) {
    
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


  public RestfulFormEntryV1 placeHolder(java.lang.String placeHolder) {
    
    this.placeHolder = placeHolder;
    return this;
  }

   /**
   * Get placeHolder
   * @return placeHolder
  **/
  @javax.annotation.Nullable
  public java.lang.String getPlaceHolder() {
    return placeHolder;
  }


  public void setPlaceHolder(java.lang.String placeHolder) {
    this.placeHolder = placeHolder;
  }


  public RestfulFormEntryV1 stringValue(java.lang.String stringValue) {
    
    this.stringValue = stringValue;
    return this;
  }

   /**
   * Get stringValue
   * @return stringValue
  **/
  @javax.annotation.Nullable
  public java.lang.String getStringValue() {
    return stringValue;
  }


  public void setStringValue(java.lang.String stringValue) {
    this.stringValue = stringValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestfulFormEntryV1 restfulFormEntryV1 = (RestfulFormEntryV1) o;
    return Objects.equals(this.entryKey, restfulFormEntryV1.entryKey) &&
        Objects.equals(this.formId, restfulFormEntryV1.formId) &&
        Objects.equals(this.id, restfulFormEntryV1.id) &&
        Objects.equals(this.placeHolder, restfulFormEntryV1.placeHolder) &&
        Objects.equals(this.stringValue, restfulFormEntryV1.stringValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryKey, formId, id, placeHolder, stringValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestfulFormEntryV1 {\n");
    sb.append("    entryKey: ").append(toIndentedString(entryKey)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    placeHolder: ").append(toIndentedString(placeHolder)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
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
    openapiFields.add("entryKey");
    openapiFields.add("formId");
    openapiFields.add("id");
    openapiFields.add("placeHolder");
    openapiFields.add("stringValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RestfulFormEntryV1
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RestfulFormEntryV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RestfulFormEntryV1 is not found in the empty JSON string", RestfulFormEntryV1.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RestfulFormEntryV1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RestfulFormEntryV1` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("entryKey") != null && !jsonObj.get("entryKey").isJsonNull()) && !jsonObj.get("entryKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entryKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entryKey").toString()));
      }
      if ((jsonObj.get("formId") != null && !jsonObj.get("formId").isJsonNull()) && !jsonObj.get("formId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `formId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("placeHolder") != null && !jsonObj.get("placeHolder").isJsonNull()) && !jsonObj.get("placeHolder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placeHolder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placeHolder").toString()));
      }
      if ((jsonObj.get("stringValue") != null && !jsonObj.get("stringValue").isJsonNull()) && !jsonObj.get("stringValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stringValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stringValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RestfulFormEntryV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RestfulFormEntryV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RestfulFormEntryV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RestfulFormEntryV1.class));

       return (TypeAdapter<T>) new TypeAdapter<RestfulFormEntryV1>() {
           @Override
           public void write(JsonWriter out, RestfulFormEntryV1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RestfulFormEntryV1 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RestfulFormEntryV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RestfulFormEntryV1
  * @throws IOException if the JSON string is invalid with respect to RestfulFormEntryV1
  */
  public static RestfulFormEntryV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RestfulFormEntryV1.class);
  }

 /**
  * Convert an instance of RestfulFormEntryV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

