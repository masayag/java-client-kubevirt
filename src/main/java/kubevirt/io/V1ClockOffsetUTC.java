/*
 * KubeVirt API
 * This is KubeVirt API an add-on for Kubernetes.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: kubevirt-dev@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package kubevirt.io;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UTC sets the guest clock to UTC on each boot.
 */
@ApiModel(description = "UTC sets the guest clock to UTC on each boot.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1ClockOffsetUTC {
  @SerializedName("offsetSeconds")
  private Integer offsetSeconds = null;

  public V1ClockOffsetUTC offsetSeconds(Integer offsetSeconds) {
    this.offsetSeconds = offsetSeconds;
    return this;
  }

   /**
   * OffsetSeconds specifies an offset in seconds, relative to UTC. If set, guest changes to the clock will be kept during reboots and not reset.
   * @return offsetSeconds
  **/
  @ApiModelProperty(value = "OffsetSeconds specifies an offset in seconds, relative to UTC. If set, guest changes to the clock will be kept during reboots and not reset.")
  public Integer getOffsetSeconds() {
    return offsetSeconds;
  }

  public void setOffsetSeconds(Integer offsetSeconds) {
    this.offsetSeconds = offsetSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ClockOffsetUTC v1ClockOffsetUTC = (V1ClockOffsetUTC) o;
    return Objects.equals(this.offsetSeconds, v1ClockOffsetUTC.offsetSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offsetSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ClockOffsetUTC {\n");
    
    sb.append("    offsetSeconds: ").append(toIndentedString(offsetSeconds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

