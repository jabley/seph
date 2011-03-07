/*
 * See LICENSE file in distribution for copyright and licensing information.
 */
package seph.lang;

import seph.lang.persistent.IPersistentList;

import java.dyn.MethodHandle;

/**
 * @author <a href="mailto:ola.bini@gmail.com">Ola Bini</a>
 */
@SephSingleton(parents={"Base", "DefaultBehavior"})
public class SephGround implements SephObject {
    public final static SephGround instance = new SephGround();

    public final SephObject parent1 = Base.instance;
    public final SephObject parent2 = DefaultBehavior.instance;


    public SephObject get(String cellName) {
        return seph.lang.bim.SephGroundBase.get(cellName);
    }

    public Object identity() {
        return seph.lang.bim.SephGroundBase.IDENTITY;
    }

    public boolean isActivatable() {
        return false;
    }

    public boolean isTrue() {
        return true;
    }

    public SephObject activateWith(SephObject receiver, SThread thread, LexicalScope scope, IPersistentList arguments) {
        throw new RuntimeException(" *** couldn't activate: " + this);
    }

    public SephObject activateWith(SephObject receiver, SThread thread, LexicalScope scope) {
        throw new RuntimeException(" *** couldn't activate: " + this);
    }

    public SephObject activateWith(SephObject receiver, SThread thread, LexicalScope scope, SephObject arg0) {
        throw new RuntimeException(" *** couldn't activate: " + this);
    }

    public SephObject activateWith(SephObject receiver, SThread thread, LexicalScope scope, SephObject arg0, SephObject arg1) {
        throw new RuntimeException(" *** couldn't activate: " + this);
    }

    public SephObject activateWith(SephObject receiver, SThread thread, LexicalScope scope, SephObject arg0, SephObject arg1, SephObject arg2) {
        throw new RuntimeException(" *** couldn't activate: " + this);
    }

    public SephObject activateWith(SephObject receiver, SThread thread, LexicalScope scope, SephObject arg0, SephObject arg1, SephObject arg2, SephObject arg3) {
        throw new RuntimeException(" *** couldn't activate: " + this);
    }

    public SephObject activateWith(SephObject receiver, SThread thread, LexicalScope scope, SephObject arg0, SephObject arg1, SephObject arg2, SephObject arg3, SephObject arg4) {
        throw new RuntimeException(" *** couldn't activate: " + this);
    }

    public SephObject activateWith(SephObject receiver, SThread thread, LexicalScope scope, MethodHandle arg0) {
        throw new RuntimeException(" *** couldn't activate: " + this);
    }

    public SephObject activateWith(SephObject receiver, SThread thread, LexicalScope scope, MethodHandle arg0, MethodHandle arg1) {
        throw new RuntimeException(" *** couldn't activate: " + this);
    }

    public SephObject activateWith(SephObject receiver, SThread thread, LexicalScope scope, MethodHandle arg0, MethodHandle arg1, MethodHandle arg2) {
        throw new RuntimeException(" *** couldn't activate: " + this);
    }

    public SephObject activateWith(SephObject receiver, SThread thread, LexicalScope scope, MethodHandle arg0, MethodHandle arg1, MethodHandle arg2, MethodHandle arg3) {
        throw new RuntimeException(" *** couldn't activate: " + this);
    }

    public SephObject activateWith(SephObject receiver, SThread thread, LexicalScope scope, MethodHandle arg0, MethodHandle arg1, MethodHandle arg2, MethodHandle arg3, MethodHandle arg4) {
        throw new RuntimeException(" *** couldn't activate: " + this);
    }
}// SephGround
