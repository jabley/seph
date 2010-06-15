/*
 * See LICENSE file in distribution for copyright and licensing information.
 */
package seph.lang.ast;

import seph.lang.SephObject;

/**
 * @author <a href="mailto:ola.bini@gmail.com">Ola Bini</a>
 */
public final class NamedMessage implements Message, SephObject {
    private final String name;
    private final Message[] arguments;
    private final Message next;

    private final static Message[] NO_ARGUMENTS = new Message[0];
    
    public NamedMessage(String name, Message[] arguments, Message next) {
        this.name = name;
        this.arguments = arguments == null ? NO_ARGUMENTS : arguments;
        this.next = next;
    }

    public String name() {
        return this.name;
    }

    public Message[] arguments() {
        return this.arguments;
    }

    public Message next() {
        return this.next;
    }

    public Message withNext(Message newNext) {
        return new NamedMessage(this.name, this.arguments, newNext);
    }
}// NamedMessage