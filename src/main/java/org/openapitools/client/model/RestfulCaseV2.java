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
import java.math.BigDecimal;
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
 * RestfulCaseV2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T23:02:59.563495701+01:00[Europe/Berlin]")
public class RestfulCaseV2 {
  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Integer archived;

  public static final String SERIALIZED_NAME_ASSISTANT = "assistant";
  @SerializedName(SERIALIZED_NAME_ASSISTANT)
  private java.lang.String assistant;

  public static final String SERIALIZED_NAME_CLAIM_NUMBER = "claimNumber";
  @SerializedName(SERIALIZED_NAME_CLAIM_NUMBER)
  private java.lang.String claimNumber;

  public static final String SERIALIZED_NAME_CLAIM_VALUE = "claimValue";
  @SerializedName(SERIALIZED_NAME_CLAIM_VALUE)
  private BigDecimal claimValue;

  public static final String SERIALIZED_NAME_CUSTOM1 = "custom1";
  @SerializedName(SERIALIZED_NAME_CUSTOM1)
  private java.lang.String custom1;

  public static final String SERIALIZED_NAME_CUSTOM2 = "custom2";
  @SerializedName(SERIALIZED_NAME_CUSTOM2)
  private java.lang.String custom2;

  public static final String SERIALIZED_NAME_CUSTOM3 = "custom3";
  @SerializedName(SERIALIZED_NAME_CUSTOM3)
  private java.lang.String custom3;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private Object dateCreated;

  public static final String SERIALIZED_NAME_DATE_UPDATED = "dateUpdated";
  @SerializedName(SERIALIZED_NAME_DATE_UPDATED)
  private Object dateUpdated;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private java.lang.String externalId;

  public static final String SERIALIZED_NAME_FILE_NUMBER = "fileNumber";
  @SerializedName(SERIALIZED_NAME_FILE_NUMBER)
  private java.lang.String fileNumber;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private java.lang.String group;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private java.lang.String id;

  public static final String SERIALIZED_NAME_LAWYER = "lawyer";
  @SerializedName(SERIALIZED_NAME_LAWYER)
  private java.lang.String lawyer;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private java.lang.String name;

  public static final String SERIALIZED_NAME_NOTICE = "notice";
  @SerializedName(SERIALIZED_NAME_NOTICE)
  private java.lang.String notice;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private java.lang.String reason;

  public static final String SERIALIZED_NAME_SUBJECT_FIELD = "subjectField";
  @SerializedName(SERIALIZED_NAME_SUBJECT_FIELD)
  private java.lang.String subjectField;

  public RestfulCaseV2() {
  }

  public RestfulCaseV2 archived(Integer archived) {
    
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @javax.annotation.Nullable
  public Integer getArchived() {
    return archived;
  }


  public void setArchived(Integer archived) {
    this.archived = archived;
  }


  public RestfulCaseV2 assistant(java.lang.String assistant) {
    
    this.assistant = assistant;
    return this;
  }

   /**
   * Get assistant
   * @return assistant
  **/
  @javax.annotation.Nullable
  public java.lang.String getAssistant() {
    return assistant;
  }


  public void setAssistant(java.lang.String assistant) {
    this.assistant = assistant;
  }


  public RestfulCaseV2 claimNumber(java.lang.String claimNumber) {
    
    this.claimNumber = claimNumber;
    return this;
  }

   /**
   * Get claimNumber
   * @return claimNumber
  **/
  @javax.annotation.Nullable
  public java.lang.String getClaimNumber() {
    return claimNumber;
  }


  public void setClaimNumber(java.lang.String claimNumber) {
    this.claimNumber = claimNumber;
  }


  public RestfulCaseV2 claimValue(BigDecimal claimValue) {
    
    this.claimValue = claimValue;
    return this;
  }

   /**
   * Get claimValue
   * @return claimValue
  **/
  @javax.annotation.Nullable
  public BigDecimal getClaimValue() {
    return claimValue;
  }


  public void setClaimValue(BigDecimal claimValue) {
    this.claimValue = claimValue;
  }


  public RestfulCaseV2 custom1(java.lang.String custom1) {
    
    this.custom1 = custom1;
    return this;
  }

   /**
   * Get custom1
   * @return custom1
  **/
  @javax.annotation.Nullable
  public java.lang.String getCustom1() {
    return custom1;
  }


  public void setCustom1(java.lang.String custom1) {
    this.custom1 = custom1;
  }


  public RestfulCaseV2 custom2(java.lang.String custom2) {
    
    this.custom2 = custom2;
    return this;
  }

   /**
   * Get custom2
   * @return custom2
  **/
  @javax.annotation.Nullable
  public java.lang.String getCustom2() {
    return custom2;
  }


  public void setCustom2(java.lang.String custom2) {
    this.custom2 = custom2;
  }


  public RestfulCaseV2 custom3(java.lang.String custom3) {
    
    this.custom3 = custom3;
    return this;
  }

   /**
   * Get custom3
   * @return custom3
  **/
  @javax.annotation.Nullable
  public java.lang.String getCustom3() {
    return custom3;
  }


  public void setCustom3(java.lang.String custom3) {
    this.custom3 = custom3;
  }


  public RestfulCaseV2 dateCreated(Object dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  public Object getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(Object dateCreated) {
    this.dateCreated = dateCreated;
  }


  public RestfulCaseV2 dateUpdated(Object dateUpdated) {
    
    this.dateUpdated = dateUpdated;
    return this;
  }

   /**
   * Get dateUpdated
   * @return dateUpdated
  **/
  @javax.annotation.Nullable
  public Object getDateUpdated() {
    return dateUpdated;
  }


  public void setDateUpdated(Object dateUpdated) {
    this.dateUpdated = dateUpdated;
  }


  public RestfulCaseV2 externalId(java.lang.String externalId) {
    
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


  public RestfulCaseV2 fileNumber(java.lang.String fileNumber) {
    
    this.fileNumber = fileNumber;
    return this;
  }

   /**
   * Get fileNumber
   * @return fileNumber
  **/
  @javax.annotation.Nullable
  public java.lang.String getFileNumber() {
    return fileNumber;
  }


  public void setFileNumber(java.lang.String fileNumber) {
    this.fileNumber = fileNumber;
  }


  public RestfulCaseV2 group(java.lang.String group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  public java.lang.String getGroup() {
    return group;
  }


  public void setGroup(java.lang.String group) {
    this.group = group;
  }


  public RestfulCaseV2 id(java.lang.String id) {
    
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


  public RestfulCaseV2 lawyer(java.lang.String lawyer) {
    
    this.lawyer = lawyer;
    return this;
  }

   /**
   * Get lawyer
   * @return lawyer
  **/
  @javax.annotation.Nullable
  public java.lang.String getLawyer() {
    return lawyer;
  }


  public void setLawyer(java.lang.String lawyer) {
    this.lawyer = lawyer;
  }


  public RestfulCaseV2 name(java.lang.String name) {
    
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


  public RestfulCaseV2 notice(java.lang.String notice) {
    
    this.notice = notice;
    return this;
  }

   /**
   * Get notice
   * @return notice
  **/
  @javax.annotation.Nullable
  public java.lang.String getNotice() {
    return notice;
  }


  public void setNotice(java.lang.String notice) {
    this.notice = notice;
  }


  public RestfulCaseV2 reason(java.lang.String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  public java.lang.String getReason() {
    return reason;
  }


  public void setReason(java.lang.String reason) {
    this.reason = reason;
  }


  public RestfulCaseV2 subjectField(java.lang.String subjectField) {
    
    this.subjectField = subjectField;
    return this;
  }

   /**
   * Get subjectField
   * @return subjectField
  **/
  @javax.annotation.Nullable
  public java.lang.String getSubjectField() {
    return subjectField;
  }


  public void setSubjectField(java.lang.String subjectField) {
    this.subjectField = subjectField;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestfulCaseV2 restfulCaseV2 = (RestfulCaseV2) o;
    return Objects.equals(this.archived, restfulCaseV2.archived) &&
        Objects.equals(this.assistant, restfulCaseV2.assistant) &&
        Objects.equals(this.claimNumber, restfulCaseV2.claimNumber) &&
        Objects.equals(this.claimValue, restfulCaseV2.claimValue) &&
        Objects.equals(this.custom1, restfulCaseV2.custom1) &&
        Objects.equals(this.custom2, restfulCaseV2.custom2) &&
        Objects.equals(this.custom3, restfulCaseV2.custom3) &&
        Objects.equals(this.dateCreated, restfulCaseV2.dateCreated) &&
        Objects.equals(this.dateUpdated, restfulCaseV2.dateUpdated) &&
        Objects.equals(this.externalId, restfulCaseV2.externalId) &&
        Objects.equals(this.fileNumber, restfulCaseV2.fileNumber) &&
        Objects.equals(this.group, restfulCaseV2.group) &&
        Objects.equals(this.id, restfulCaseV2.id) &&
        Objects.equals(this.lawyer, restfulCaseV2.lawyer) &&
        Objects.equals(this.name, restfulCaseV2.name) &&
        Objects.equals(this.notice, restfulCaseV2.notice) &&
        Objects.equals(this.reason, restfulCaseV2.reason) &&
        Objects.equals(this.subjectField, restfulCaseV2.subjectField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archived, assistant, claimNumber, claimValue, custom1, custom2, custom3, dateCreated, dateUpdated, externalId, fileNumber, group, id, lawyer, name, notice, reason, subjectField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestfulCaseV2 {\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    assistant: ").append(toIndentedString(assistant)).append("\n");
    sb.append("    claimNumber: ").append(toIndentedString(claimNumber)).append("\n");
    sb.append("    claimValue: ").append(toIndentedString(claimValue)).append("\n");
    sb.append("    custom1: ").append(toIndentedString(custom1)).append("\n");
    sb.append("    custom2: ").append(toIndentedString(custom2)).append("\n");
    sb.append("    custom3: ").append(toIndentedString(custom3)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    fileNumber: ").append(toIndentedString(fileNumber)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lawyer: ").append(toIndentedString(lawyer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notice: ").append(toIndentedString(notice)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    subjectField: ").append(toIndentedString(subjectField)).append("\n");
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
    openapiFields.add("archived");
    openapiFields.add("assistant");
    openapiFields.add("claimNumber");
    openapiFields.add("claimValue");
    openapiFields.add("custom1");
    openapiFields.add("custom2");
    openapiFields.add("custom3");
    openapiFields.add("dateCreated");
    openapiFields.add("dateUpdated");
    openapiFields.add("externalId");
    openapiFields.add("fileNumber");
    openapiFields.add("group");
    openapiFields.add("id");
    openapiFields.add("lawyer");
    openapiFields.add("name");
    openapiFields.add("notice");
    openapiFields.add("reason");
    openapiFields.add("subjectField");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RestfulCaseV2
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RestfulCaseV2.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RestfulCaseV2 is not found in the empty JSON string", RestfulCaseV2.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RestfulCaseV2.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RestfulCaseV2` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("assistant") != null && !jsonObj.get("assistant").isJsonNull()) && !jsonObj.get("assistant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assistant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assistant").toString()));
      }
      if ((jsonObj.get("claimNumber") != null && !jsonObj.get("claimNumber").isJsonNull()) && !jsonObj.get("claimNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `claimNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("claimNumber").toString()));
      }
      if ((jsonObj.get("custom1") != null && !jsonObj.get("custom1").isJsonNull()) && !jsonObj.get("custom1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom1").toString()));
      }
      if ((jsonObj.get("custom2") != null && !jsonObj.get("custom2").isJsonNull()) && !jsonObj.get("custom2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom2").toString()));
      }
      if ((jsonObj.get("custom3") != null && !jsonObj.get("custom3").isJsonNull()) && !jsonObj.get("custom3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom3").toString()));
      }
      if ((jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonNull()) && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if ((jsonObj.get("fileNumber") != null && !jsonObj.get("fileNumber").isJsonNull()) && !jsonObj.get("fileNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileNumber").toString()));
      }
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("lawyer") != null && !jsonObj.get("lawyer").isJsonNull()) && !jsonObj.get("lawyer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lawyer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lawyer").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("notice") != null && !jsonObj.get("notice").isJsonNull()) && !jsonObj.get("notice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notice").toString()));
      }
      if ((jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if ((jsonObj.get("subjectField") != null && !jsonObj.get("subjectField").isJsonNull()) && !jsonObj.get("subjectField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectField").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RestfulCaseV2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RestfulCaseV2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RestfulCaseV2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RestfulCaseV2.class));

       return (TypeAdapter<T>) new TypeAdapter<RestfulCaseV2>() {
           @Override
           public void write(JsonWriter out, RestfulCaseV2 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RestfulCaseV2 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RestfulCaseV2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RestfulCaseV2
  * @throws IOException if the JSON string is invalid with respect to RestfulCaseV2
  */
  public static RestfulCaseV2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RestfulCaseV2.class);
  }

 /**
  * Convert an instance of RestfulCaseV2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

