/* THIS FILE IS GENERATED. DO NOT EDIT */
package seph.lang.structure;

import seph.lang.*;
import seph.lang.persistent.*;

public class SephObject_n_2 extends SephObjectStructure {
    public final IPersistentVector parents;

    public final String selector0;
    public final SephObject cell0;
    public final String selector1;
    public final SephObject cell1;

    public SephObject_n_2(IPersistentMap meta, IPersistentVector parents, String selector0, SephObject cell0, String selector1, SephObject cell1) {
        super(meta);
        this.parents = parents;

        this.selector0 = selector0.intern();
        this.cell0 = cell0;
        this.selector1 = selector1.intern();
        this.cell1 = cell1;
    }

    public final SephObject get(String name) {
        name = name.intern();

        if(name == this.selector0) return this.cell0;
        if(name == this.selector1) return this.cell1;
        SephObject result;
        for(ISeq s = this.parents.seq(); s != null; s = s.next()) {
            result = ((SephObject)s.first()).get(name);
            if(result != null) return result;
        }
        return null;
    }
}
