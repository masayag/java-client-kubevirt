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
 * DataVolumeStatus provides the parameters to store the phase of the Data Volume
 */
@ApiModel(description = "DataVolumeStatus provides the parameters to store the phase of the Data Volume")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1alpha1DataVolumeStatus {
  @SerializedName("phase")
  private String phase = null;

  @SerializedName("progress")
  private String progress = null;

  public V1alpha1DataVolumeStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Phase is the current phase of the data volume
   * @return phase
  **/
  @ApiModelProperty(value = "Phase is the current phase of the data volume")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public V1alpha1DataVolumeStatus progress(String progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @ApiModelProperty(value = "")
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1DataVolumeStatus v1alpha1DataVolumeStatus = (V1alpha1DataVolumeStatus) o;
    return Objects.equals(this.phase, v1alpha1DataVolumeStatus.phase) &&
        Objects.equals(this.progress, v1alpha1DataVolumeStatus.progress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phase, progress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1DataVolumeStatus {\n");
    
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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

