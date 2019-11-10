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
 * Represents the multus cni network.
 */
@ApiModel(description = "Represents the multus cni network.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1MultusNetwork {
  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("networkName")
  private String networkName = null;

  public V1MultusNetwork _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Select the default network and add it to the multus-cni.io/default-network annotation.
   * @return _default
  **/
  @ApiModelProperty(value = "Select the default network and add it to the multus-cni.io/default-network annotation.")
  public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public V1MultusNetwork networkName(String networkName) {
    this.networkName = networkName;
    return this;
  }

   /**
   * References to a NetworkAttachmentDefinition CRD object. Format: &lt;networkName&gt;, &lt;namespace&gt;/&lt;networkName&gt;. If namespace is not specified, VMI namespace is assumed.
   * @return networkName
  **/
  @ApiModelProperty(required = true, value = "References to a NetworkAttachmentDefinition CRD object. Format: <networkName>, <namespace>/<networkName>. If namespace is not specified, VMI namespace is assumed.")
  public String getNetworkName() {
    return networkName;
  }

  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1MultusNetwork v1MultusNetwork = (V1MultusNetwork) o;
    return Objects.equals(this._default, v1MultusNetwork._default) &&
        Objects.equals(this.networkName, v1MultusNetwork.networkName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, networkName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MultusNetwork {\n");
    
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
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

