//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zts;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import com.yahoo.rdl.*;

//
// SSHCertRequestData -
//
public class SSHCertRequestData {
    public List<String> principals;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> sources;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> destinations;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String publicKey;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String touchPublicKey;

    public SSHCertRequestData setPrincipals(List<String> principals) {
        this.principals = principals;
        return this;
    }
    public List<String> getPrincipals() {
        return principals;
    }
    public SSHCertRequestData setSources(List<String> sources) {
        this.sources = sources;
        return this;
    }
    public List<String> getSources() {
        return sources;
    }
    public SSHCertRequestData setDestinations(List<String> destinations) {
        this.destinations = destinations;
        return this;
    }
    public List<String> getDestinations() {
        return destinations;
    }
    public SSHCertRequestData setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return publicKey;
    }
    public SSHCertRequestData setTouchPublicKey(String touchPublicKey) {
        this.touchPublicKey = touchPublicKey;
        return this;
    }
    public String getTouchPublicKey() {
        return touchPublicKey;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != SSHCertRequestData.class) {
                return false;
            }
            SSHCertRequestData a = (SSHCertRequestData) another;
            if (principals == null ? a.principals != null : !principals.equals(a.principals)) {
                return false;
            }
            if (sources == null ? a.sources != null : !sources.equals(a.sources)) {
                return false;
            }
            if (destinations == null ? a.destinations != null : !destinations.equals(a.destinations)) {
                return false;
            }
            if (publicKey == null ? a.publicKey != null : !publicKey.equals(a.publicKey)) {
                return false;
            }
            if (touchPublicKey == null ? a.touchPublicKey != null : !touchPublicKey.equals(a.touchPublicKey)) {
                return false;
            }
        }
        return true;
    }
}
