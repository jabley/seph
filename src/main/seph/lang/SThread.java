/*
 * See LICENSE file in distribution for copyright and licensing information.
 */
package seph.lang;

import seph.lang.ast.Message;
import seph.lang.persistent.IPersistentList;

/**
 * Represents a running thread of Seph computation. This
 * might not correspond to any real threads.
 *
 * @author <a href="mailto:ola.bini@gmail.com">Ola Bini</a>
 */
public class SThread {
    public final static SephObject TAIL_MARKER = new SimpleSephObject() {
            public String toString() {
                return "TAIL_MARKER (should never escape, it's a bug if you see this)";
            }
        };

    public final Runtime runtime;

    public Message next;
    public boolean first;

    public TailCallable nextTail;
    public LexicalScope nextScope;
    public SephObject nextReceiver;
    public IPersistentList arguments;

    public SThread(Runtime runtime) {
        this.runtime = runtime;
    }
}// SThread
