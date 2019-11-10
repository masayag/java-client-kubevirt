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
 * V1LunTarget
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1LunTarget {
  @SerializedName("bus")
  private String bus = null;

  @SerializedName("readonly")
  private Boolean readonly = null;

  public V1LunTarget bus(String bus) {
    this.bus = bus;
    return this;
  }

   /**
   * Bus indicates the type of disk device to emulate. supported values: virtio, sata, scsi.
   * @return bus
  **/
  @ApiModelProperty(value = "Bus indicates the type of disk device to emulate. supported values: virtio, sata, scsi.")
  public String getBus() {
    return bus;
  }

  public void setBus(String bus) {
    this.bus = bus;
  }

  public V1LunTarget readonly(Boolean readonly) {
    this.readonly = readonly;
    return this;
  }

   /**
   * ReadOnly. Defaults to false.
   * @return readonly
  **/
  @ApiModelProperty(value = "ReadOnly. Defaults to false.")
  public Boolean isReadonly() {
    return readonly;
  }

  public void setReadonly(Boolean readonly) {
    this.readonly = readonly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LunTarget v1LunTarget = (V1LunTarget) o;
    return Objects.equals(this.bus, v1LunTarget.bus) &&
        Objects.equals(this.readonly, v1LunTarget.readonly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bus, readonly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LunTarget {\n");
    
    sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
    sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
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

