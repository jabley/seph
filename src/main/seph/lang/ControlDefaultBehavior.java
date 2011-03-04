/*
 * See LICENSE file in distribution for copyright and licensing information.
 */
package seph.lang;

import seph.lang.ast.Message;
import seph.lang.ast.NamedMessage;
import seph.lang.persistent.IPersistentList;
import seph.lang.persistent.RT;
import seph.lang.persistent.ISeq;

import java.dyn.MethodHandle;

/**
 * @author <a href="mailto:ola.bini@gmail.com">Ola Bini</a>
 */
@SephSingleton
public class ControlDefaultBehavior implements SephObject {
    public final static ControlDefaultBehavior instance = new ControlDefaultBehavior();

    public static SephObject evaluateArgument(Object possibleArgument, LexicalScope scope, SThread thread, boolean fully) {
        if(possibleArgument instanceof Message) {
            if(fully) {
                return scope.evaluateFully(thread, (Message)possibleArgument);
            } else {
                return scope.evaluate(thread, (Message)possibleArgument);
            }
        } else {
            try {
                MethodHandle mh = (MethodHandle)possibleArgument;
                return (SephObject)mh.invokeExact(thread, scope, true);
            } catch(Throwable e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    @SephMethod(name="if", evaluateArguments=false)
    public final static SephObject _if(SThread thread, LexicalScope scope, IPersistentList arguments) {
        SephObject result = evaluateArgument(RT.first(arguments), scope, thread, true);

        if(result.isTrue()) {
            ISeq seq = RT.next(arguments);
            if(null != seq) {
                return evaluateArgument(RT.first(seq), scope, thread, false);
            } else {
                return Runtime.NIL;
            }
        } else {
            ISeq seq = RT.next(RT.next(arguments));
            if(null != seq) {
                return evaluateArgument(RT.first(seq), scope, thread, false);
            } else {
                return Runtime.NIL;
            }
        }
    }

    public SephObject get(String cellName) {
        return seph.lang.bim.ControlDefaultBehaviorBase.get(cellName);
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
}// ControlDefaultBehavior
