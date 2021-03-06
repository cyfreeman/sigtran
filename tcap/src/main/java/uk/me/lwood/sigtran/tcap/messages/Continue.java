package uk.me.lwood.sigtran.tcap.messages;

import uk.me.lwood.asn1.annotations.Optional;
import uk.me.lwood.sigtran.tcap.DestTransactionId;
import uk.me.lwood.sigtran.tcap.OrigTransactionId;
import uk.me.lwood.sigtran.tcap.ros.ComponentPortion;
import uk.me.lwood.sigtran.tcap.ros.DialoguePortion;

/**
 * 
 * @author lukew
 */
public class Continue implements TcapMessage {
    private final OrigTransactionId origTransactionId;
    private final DestTransactionId destTransactionId;
    @Optional
    private final DialoguePortion dialoguePortion;
    @Optional
    private final ComponentPortion components;
    
    public Continue(OrigTransactionId origTransactionId, DestTransactionId destTransactionId, DialoguePortion dialoguePortion, ComponentPortion components) {
        this.origTransactionId = origTransactionId;
        this.destTransactionId = destTransactionId;
        this.dialoguePortion = dialoguePortion;
        this.components = components;
    }

    public final OrigTransactionId getOrigTransactionId() {
        return origTransactionId;
    }

    public final DestTransactionId getDestTransactionId() {
        return destTransactionId;
    }
    
    public final DialoguePortion getDialoguePortion() {
        return dialoguePortion;
    }

    public final ComponentPortion getComponents() {
        return components;
    }
}
