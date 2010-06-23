/*
 * See LICENSE file in distribution for copyright and licensing information.
 */
package seph.lang;

import org.jregex.Pattern;

/**
 * @author <a href="mailto:ola.bini@gmail.com">Ola Bini</a>
 */
public class Regexp implements SephObject { 
    private final String pattern;
    private final Pattern regexp;
    private final String flags;

    private Regexp(String pattern, Pattern regexp, String flags) {
        this.pattern = pattern;
        this.regexp = regexp;
        this.flags = flags;
    }

    public static Regexp create(String pattern, String flags) {
        return new Regexp(pattern, new Pattern(pattern, flags), flags);
    }

    public String pattern() {
        return this.pattern;
    }

    public Pattern regexp() {
        return this.regexp;
    }

    public String flags() {
        return this.flags;
    }
}// Regexp