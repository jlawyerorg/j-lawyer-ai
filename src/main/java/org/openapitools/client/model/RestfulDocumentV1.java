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
 * RestfulDocumentV1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T23:02:59.563495701+01:00[Europe/Berlin]")
public class RestfulDocumentV1 {
  public static final String SERIALIZED_NAME_CHANGE_DATE = "changeDate";
  @SerializedName(SERIALIZED_NAME_CHANGE_DATE)
  private Object changeDate;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private Object creationDate;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private java.lang.String externalId;

  public static final String SERIALIZED_NAME_FAVORITE = "favorite";
  @SerializedName(SERIALIZED_NAME_FAVORITE)
  private Boolean favorite;

  public static final String SERIALIZED_NAME_FOLDER_ID = "folderId";
  @SerializedName(SERIALIZED_NAME_FOLDER_ID)
  private java.lang.String folderId;

  public static final String SERIALIZED_NAME_HIGHLIGHT1 = "highlight1";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHT1)
  private Integer highlight1;

  public static final String SERIALIZED_NAME_HIGHLIGHT2 = "highlight2";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHT2)
  private Integer highlight2;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private java.lang.String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private java.lang.String name;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public RestfulDocumentV1() {
  }

  public RestfulDocumentV1 changeDate(Object changeDate) {
    
    this.changeDate = changeDate;
    return this;
  }

   /**
   * Get changeDate
   * @return changeDate
  **/
  @javax.annotation.Nullable
  public Object getChangeDate() {
    return changeDate;
  }


  public void setChangeDate(Object changeDate) {
    this.changeDate = changeDate;
  }


  public RestfulDocumentV1 creationDate(Object creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  public Object getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(Object creationDate) {
    this.creationDate = creationDate;
  }


  public RestfulDocumentV1 externalId(java.lang.String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  public java.lang.String getExternalId() {
    return externalId;
  }


  public void setExternalId(java.lang.String externalId) {
    this.externalId = externalId;
  }


  public RestfulDocumentV1 favorite(Boolean favorite) {
    
    this.favorite = favorite;
    return this;
  }

   /**
   * Get favorite
   * @return favorite
  **/
  @javax.annotation.Nullable
  public Boolean getFavorite() {
    return favorite;
  }


  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }


  public RestfulDocumentV1 folderId(java.lang.String folderId) {
    
    this.folderId = folderId;
    return this;
  }

   /**
   * Get folderId
   * @return folderId
  **/
  @javax.annotation.Nullable
  public java.lang.String getFolderId() {
    return folderId;
  }


  public void setFolderId(java.lang.String folderId) {
    this.folderId = folderId;
  }


  public RestfulDocumentV1 highlight1(Integer highlight1) {
    
    this.highlight1 = highlight1;
    return this;
  }

   /**
   * Get highlight1
   * @return highlight1
  **/
  @javax.annotation.Nullable
  public Integer getHighlight1() {
    return highlight1;
  }


  public void setHighlight1(Integer highlight1) {
    this.highlight1 = highlight1;
  }


  public RestfulDocumentV1 highlight2(Integer highlight2) {
    
    this.highlight2 = highlight2;
    return this;
  }

   /**
   * Get highlight2
   * @return highlight2
  **/
  @javax.annotation.Nullable
  public Integer getHighlight2() {
    return highlight2;
  }


  public void setHighlight2(Integer highlight2) {
    this.highlight2 = highlight2;
  }


  public RestfulDocumentV1 id(java.lang.String id) {
    
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


  public RestfulDocumentV1 name(java.lang.String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public java.lang.String getName() {
    return name;
  }


  public void setName(java.lang.String name) {
    this.name = name;
  }


  public RestfulDocumentV1 size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public RestfulDocumentV1 version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestfulDocumentV1 restfulDocumentV1 = (RestfulDocumentV1) o;
    return Objects.equals(this.changeDate, restfulDocumentV1.changeDate) &&
        Objects.equals(this.creationDate, restfulDocumentV1.creationDate) &&
        Objects.equals(this.externalId, restfulDocumentV1.externalId) &&
        Objects.equals(this.favorite, restfulDocumentV1.favorite) &&
        Objects.equals(this.folderId, restfulDocumentV1.folderId) &&
        Objects.equals(this.highlight1, restfulDocumentV1.highlight1) &&
        Objects.equals(this.highlight2, restfulDocumentV1.highlight2) &&
        Objects.equals(this.id, restfulDocumentV1.id) &&
        Objects.equals(this.name, restfulDocumentV1.name) &&
        Objects.equals(this.size, restfulDocumentV1.size) &&
        Objects.equals(this.version, restfulDocumentV1.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeDate, creationDate, externalId, favorite, folderId, highlight1, highlight2, id, name, size, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestfulDocumentV1 {\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    highlight1: ").append(toIndentedString(highlight1)).append("\n");
    sb.append("    highlight2: ").append(toIndentedString(highlight2)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("changeDate");
    openapiFields.add("creationDate");
    openapiFields.add("externalId");
    openapiFields.add("favorite");
    openapiFields.add("folderId");
    openapiFields.add("highlight1");
    openapiFields.add("highlight2");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("size");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RestfulDocumentV1
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RestfulDocumentV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RestfulDocumentV1 is not found in the empty JSON string", RestfulDocumentV1.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RestfulDocumentV1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RestfulDocumentV1` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonNull()) && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if ((jsonObj.get("folderId") != null && !jsonObj.get("folderId").isJsonNull()) && !jsonObj.get("folderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `folderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("folderId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RestfulDocumentV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RestfulDocumentV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RestfulDocumentV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RestfulDocumentV1.class));

       return (TypeAdapter<T>) new TypeAdapter<RestfulDocumentV1>() {
           @Override
           public void write(JsonWriter out, RestfulDocumentV1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RestfulDocumentV1 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RestfulDocumentV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RestfulDocumentV1
  * @throws IOException if the JSON string is invalid with respect to RestfulDocumentV1
  */
  public static RestfulDocumentV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RestfulDocumentV1.class);
  }

 /**
  * Convert an instance of RestfulDocumentV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

