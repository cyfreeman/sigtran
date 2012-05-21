package uk.me.lwood.sigtran.map.service.location;

import uk.me.lwood.sigtran.map.common.Identity;
import uk.me.lwood.sigtran.tcap.TcapArgument;

/**
 * 
 * @author lukew
 */
public class CancelLocationArg implements TcapArgument {
    private final Identity identity;
    private final CancellationType type;
    
    public CancelLocationArg(Identity identity, CancellationType type) {
        this.identity = identity;
        this.type = type;
    }

    public final Identity getIdentity() {
        return identity;
    }

    public final CancellationType getType() {
        return type;
    }
}