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
 * RestfulDueDateV6
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-14T23:02:59.563495701+01:00[Europe/Berlin]")
public class RestfulDueDateV6 {
  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private java.lang.String assignee;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private Object beginDate;

  public static final String SERIALIZED_NAME_CALENDAR = "calendar";
  @SerializedName(SERIALIZED_NAME_CALENDAR)
  private java.lang.String calendar;

  public static final String SERIALIZED_NAME_CASE_ID = "caseId";
  @SerializedName(SERIALIZED_NAME_CASE_ID)
  private java.lang.String caseId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private java.lang.String description;

  public static final String SERIALIZED_NAME_DONE = "done";
  @SerializedName(SERIALIZED_NAME_DONE)
  private Boolean done;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private Object endDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private java.lang.String id;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private java.lang.String location;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private java.lang.String summary;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private java.lang.String type;

  public RestfulDueDateV6() {
  }

  public RestfulDueDateV6 assignee(java.lang.String assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @javax.annotation.Nullable
  public java.lang.String getAssignee() {
    return assignee;
  }


  public void setAssignee(java.lang.String assignee) {
    this.assignee = assignee;
  }


  public RestfulDueDateV6 beginDate(Object beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Get beginDate
   * @return beginDate
  **/
  @javax.annotation.Nullable
  public Object getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(Object beginDate) {
    this.beginDate = beginDate;
  }


  public RestfulDueDateV6 calendar(java.lang.String calendar) {
    
    this.calendar = calendar;
    return this;
  }

   /**
   * Get calendar
   * @return calendar
  **/
  @javax.annotation.Nullable
  public java.lang.String getCalendar() {
    return calendar;
  }


  public void setCalendar(java.lang.String calendar) {
    this.calendar = calendar;
  }


  public RestfulDueDateV6 caseId(java.lang.String caseId) {
    
    this.caseId = caseId;
    return this;
  }

   /**
   * Get caseId
   * @return caseId
  **/
  @javax.annotation.Nullable
  public java.lang.String getCaseId() {
    return caseId;
  }


  public void setCaseId(java.lang.String caseId) {
    this.caseId = caseId;
  }


  public RestfulDueDateV6 description(java.lang.String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public java.lang.String getDescription() {
    return description;
  }


  public void setDescription(java.lang.String description) {
    this.description = description;
  }


  public RestfulDueDateV6 done(Boolean done) {
    
    this.done = done;
    return this;
  }

   /**
   * Get done
   * @return done
  **/
  @javax.annotation.Nullable
  public Boolean getDone() {
    return done;
  }


  public void setDone(Boolean done) {
    this.done = done;
  }


  public RestfulDueDateV6 endDate(Object endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  public Object getEndDate() {
    return endDate;
  }


  public void setEndDate(Object endDate) {
    this.endDate = endDate;
  }


  public RestfulDueDateV6 id(java.lang.String id) {
    
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


  public RestfulDueDateV6 location(java.lang.String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  public java.lang.String getLocation() {
    return location;
  }


  public void setLocation(java.lang.String location) {
    this.location = location;
  }


  public RestfulDueDateV6 summary(java.lang.String summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  public java.lang.String getSummary() {
    return summary;
  }


  public void setSummary(java.lang.String summary) {
    this.summary = summary;
  }


  public RestfulDueDateV6 type(java.lang.String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public java.lang.String getType() {
    return type;
  }


  public void setType(java.lang.String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestfulDueDateV6 restfulDueDateV6 = (RestfulDueDateV6) o;
    return Objects.equals(this.assignee, restfulDueDateV6.assignee) &&
        Objects.equals(this.beginDate, restfulDueDateV6.beginDate) &&
        Objects.equals(this.calendar, restfulDueDateV6.calendar) &&
        Objects.equals(this.caseId, restfulDueDateV6.caseId) &&
        Objects.equals(this.description, restfulDueDateV6.description) &&
        Objects.equals(this.done, restfulDueDateV6.done) &&
        Objects.equals(this.endDate, restfulDueDateV6.endDate) &&
        Objects.equals(this.id, restfulDueDateV6.id) &&
        Objects.equals(this.location, restfulDueDateV6.location) &&
        Objects.equals(this.summary, restfulDueDateV6.summary) &&
        Objects.equals(this.type, restfulDueDateV6.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, beginDate, calendar, caseId, description, done, endDate, id, location, summary, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestfulDueDateV6 {\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("assignee");
    openapiFields.add("beginDate");
    openapiFields.add("calendar");
    openapiFields.add("caseId");
    openapiFields.add("description");
    openapiFields.add("done");
    openapiFields.add("endDate");
    openapiFields.add("id");
    openapiFields.add("location");
    openapiFields.add("summary");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RestfulDueDateV6
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RestfulDueDateV6.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RestfulDueDateV6 is not found in the empty JSON string", RestfulDueDateV6.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RestfulDueDateV6.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RestfulDueDateV6` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("assignee") != null && !jsonObj.get("assignee").isJsonNull()) && !jsonObj.get("assignee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assignee").toString()));
      }
      if ((jsonObj.get("calendar") != null && !jsonObj.get("calendar").isJsonNull()) && !jsonObj.get("calendar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calendar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calendar").toString()));
      }
      if ((jsonObj.get("caseId") != null && !jsonObj.get("caseId").isJsonNull()) && !jsonObj.get("caseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseId").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RestfulDueDateV6.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RestfulDueDateV6' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RestfulDueDateV6> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RestfulDueDateV6.class));

       return (TypeAdapter<T>) new TypeAdapter<RestfulDueDateV6>() {
           @Override
           public void write(JsonWriter out, RestfulDueDateV6 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RestfulDueDateV6 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RestfulDueDateV6 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RestfulDueDateV6
  * @throws IOException if the JSON string is invalid with respect to RestfulDueDateV6
  */
  public static RestfulDueDateV6 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RestfulDueDateV6.class);
  }

 /**
  * Convert an instance of RestfulDueDateV6 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

