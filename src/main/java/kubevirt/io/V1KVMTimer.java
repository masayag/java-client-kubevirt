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
 * V1KVMTimer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1KVMTimer {
  @SerializedName("present")
  private Boolean present = null;

  public V1KVMTimer present(Boolean present) {
    this.present = present;
    return this;
  }

   /**
   * Enabled set to false makes sure that the machine type or a preset can&#39;t add the timer. Defaults to true. +optional
   * @return present
  **/
  @ApiModelProperty(value = "Enabled set to false makes sure that the machine type or a preset can't add the timer. Defaults to true. +optional")
  public Boolean isPresent() {
    return present;
  }

  public void setPresent(Boolean present) {
    this.present = present;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1KVMTimer v1KVMTimer = (V1KVMTimer) o;
    return Objects.equals(this.present, v1KVMTimer.present);
  }

  @Override
  public int hashCode() {
    return Objects.hash(present);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1KVMTimer {\n");
    
    sb.append("    present: ").append(toIndentedString(present)).append("\n");
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

