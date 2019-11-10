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
import kubevirt.io.V1HPETTimer;
import kubevirt.io.V1HypervTimer;
import kubevirt.io.V1KVMTimer;
import kubevirt.io.V1PITTimer;
import kubevirt.io.V1RTCTimer;

/**
 * Represents all available timers in a vmi.
 */
@ApiModel(description = "Represents all available timers in a vmi.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-10T14:44:51.030+02:00")
public class V1Timer {
  @SerializedName("hpet")
  private V1HPETTimer hpet = null;

  @SerializedName("hyperv")
  private V1HypervTimer hyperv = null;

  @SerializedName("kvm")
  private V1KVMTimer kvm = null;

  @SerializedName("pit")
  private V1PITTimer pit = null;

  @SerializedName("rtc")
  private V1RTCTimer rtc = null;

  public V1Timer hpet(V1HPETTimer hpet) {
    this.hpet = hpet;
    return this;
  }

   /**
   * HPET (High Precision Event Timer) - multiple timers with periodic interrupts.
   * @return hpet
  **/
  @ApiModelProperty(value = "HPET (High Precision Event Timer) - multiple timers with periodic interrupts.")
  public V1HPETTimer getHpet() {
    return hpet;
  }

  public void setHpet(V1HPETTimer hpet) {
    this.hpet = hpet;
  }

  public V1Timer hyperv(V1HypervTimer hyperv) {
    this.hyperv = hyperv;
    return this;
  }

   /**
   * Hyperv (Hypervclock) - lets guests read the host’s wall clock time (paravirtualized). For windows guests.
   * @return hyperv
  **/
  @ApiModelProperty(value = "Hyperv (Hypervclock) - lets guests read the host’s wall clock time (paravirtualized). For windows guests.")
  public V1HypervTimer getHyperv() {
    return hyperv;
  }

  public void setHyperv(V1HypervTimer hyperv) {
    this.hyperv = hyperv;
  }

  public V1Timer kvm(V1KVMTimer kvm) {
    this.kvm = kvm;
    return this;
  }

   /**
   * KVM  (KVM clock) - lets guests read the host’s wall clock time (paravirtualized). For linux guests.
   * @return kvm
  **/
  @ApiModelProperty(value = "KVM  (KVM clock) - lets guests read the host’s wall clock time (paravirtualized). For linux guests.")
  public V1KVMTimer getKvm() {
    return kvm;
  }

  public void setKvm(V1KVMTimer kvm) {
    this.kvm = kvm;
  }

  public V1Timer pit(V1PITTimer pit) {
    this.pit = pit;
    return this;
  }

   /**
   * PIT (Programmable Interval Timer) - a timer with periodic interrupts.
   * @return pit
  **/
  @ApiModelProperty(value = "PIT (Programmable Interval Timer) - a timer with periodic interrupts.")
  public V1PITTimer getPit() {
    return pit;
  }

  public void setPit(V1PITTimer pit) {
    this.pit = pit;
  }

  public V1Timer rtc(V1RTCTimer rtc) {
    this.rtc = rtc;
    return this;
  }

   /**
   * RTC (Real Time Clock) - a continuously running timer with periodic interrupts.
   * @return rtc
  **/
  @ApiModelProperty(value = "RTC (Real Time Clock) - a continuously running timer with periodic interrupts.")
  public V1RTCTimer getRtc() {
    return rtc;
  }

  public void setRtc(V1RTCTimer rtc) {
    this.rtc = rtc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Timer v1Timer = (V1Timer) o;
    return Objects.equals(this.hpet, v1Timer.hpet) &&
        Objects.equals(this.hyperv, v1Timer.hyperv) &&
        Objects.equals(this.kvm, v1Timer.kvm) &&
        Objects.equals(this.pit, v1Timer.pit) &&
        Objects.equals(this.rtc, v1Timer.rtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hpet, hyperv, kvm, pit, rtc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Timer {\n");
    
    sb.append("    hpet: ").append(toIndentedString(hpet)).append("\n");
    sb.append("    hyperv: ").append(toIndentedString(hyperv)).append("\n");
    sb.append("    kvm: ").append(toIndentedString(kvm)).append("\n");
    sb.append("    pit: ").append(toIndentedString(pit)).append("\n");
    sb.append("    rtc: ").append(toIndentedString(rtc)).append("\n");
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

