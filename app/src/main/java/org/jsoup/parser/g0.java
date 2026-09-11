package org.jsoup.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public static final g0 d;
    public final HashMap a = new HashMap();
    public final g0 b;
    public final ArrayList c;

    static {
        g0 g0Var = new g0(null, null);
        g0Var.c("http://www.w3.org/1999/xhtml", new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "dialog", "search", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "details", "menu", "plaintext", "template", "article", "main", "center", "dir", "applet", "marquee", "listing", "#root"}, new net.luminis.quic.impl.j(8));
        g0Var.c("http://www.w3.org/1999/xhtml", new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", "a", "img", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "audio", "video", "canvas", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "basefont", "bgsound", "menuitem", "data", "bdi", "s", "strike", "nobr", "ins", "del", "button", "picture", "slot", "rb"}, new net.luminis.quic.impl.j(13));
        g0Var.c("http://www.w3.org/1999/xhtml", new String[]{"title", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style"}, new net.luminis.quic.impl.j(14));
        g0Var.c("http://www.w3.org/1999/xhtml", new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"}, new net.luminis.quic.impl.j(15));
        g0Var.c("http://www.w3.org/1999/xhtml", new String[]{"pre", "plaintext", "title", "textarea", "script"}, new net.luminis.quic.impl.j(16));
        g0Var.c("http://www.w3.org/1999/xhtml", new String[]{"title", "textarea"}, new net.luminis.quic.impl.j(3));
        g0Var.c("http://www.w3.org/1999/xhtml", new String[]{"iframe", "noembed", "noframes", "script", "style", "xmp"}, new net.luminis.quic.impl.j(4));
        g0Var.c("http://www.w3.org/1999/xhtml", org.jsoup.internal.b.c, new net.luminis.quic.impl.j(5));
        g0Var.c("http://www.w3.org/1999/xhtml", new String[]{"button", "input", "select", "textarea", "option", "output", "progress", "meter", "img", "picture", "audio", "video", "canvas", "object", "embed", "iframe"}, new net.luminis.quic.impl.j(6));
        g0Var.c("http://www.w3.org/1998/Math/MathML", new String[]{"math"}, new net.luminis.quic.impl.j(7));
        g0Var.c("http://www.w3.org/1998/Math/MathML", new String[]{"mi", "mo", "msup", "mn", "mtext"}, new net.luminis.quic.impl.j(9));
        g0Var.c("http://www.w3.org/2000/svg", new String[]{"svg", "femerge", "femergenode"}, new net.luminis.quic.impl.j(10));
        g0Var.c("http://www.w3.org/2000/svg", new String[]{"text"}, new net.luminis.quic.impl.j(11));
        g0Var.c("http://www.w3.org/2000/svg", new String[]{"script"}, new net.luminis.quic.impl.j(12));
        d = g0Var;
    }

    public g0(g0 g0Var, ArrayList arrayList) {
        this.b = g0Var;
        this.c = arrayList;
    }

    public final void a(f0 f0Var) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(f0Var);
            }
        }
        ((Map) this.a.computeIfAbsent(f0Var.e, new androidx.media3.exoplayer.audio.f(8))).put(f0Var.y, f0Var);
    }

    public final f0 b(String str, String str2) {
        f0 f0VarB;
        f0 f0Var;
        org.jsoup.helper.n.H(str);
        org.jsoup.helper.n.H(str2);
        Map map = (Map) this.a.get(str2);
        if (map != null && (f0Var = (f0) map.get(str)) != null) {
            return f0Var;
        }
        g0 g0Var = this.b;
        if (g0Var == null || (f0VarB = g0Var.b(str, str2)) == null) {
            return null;
        }
        f0 f0VarClone = f0VarB.clone();
        a(f0VarClone);
        return f0VarClone;
    }

    public final void c(String str, String[] strArr, Consumer consumer) {
        for (String str2 : strArr) {
            f0 f0VarB = b(str2, str);
            if (f0VarB == null) {
                f0VarB = new f0(str2, str2, str);
                f0VarB.A = 0;
                f0VarB.e(1);
                a(f0VarB);
            }
            consumer.accept(f0VarB);
        }
    }

    public final f0 d(String str, String str2, String str3, boolean z) {
        org.jsoup.helper.n.H(str);
        org.jsoup.helper.n.H(str3);
        String strTrim = str.trim();
        org.jsoup.helper.n.E(strTrim);
        f0 f0VarB = b(strTrim, str3);
        if (f0VarB != null) {
            return f0VarB;
        }
        if (str2 == null) {
            str2 = org.jsoup.internal.b.d(strTrim);
        }
        if (!z) {
            strTrim = str2;
        }
        f0 f0VarB2 = b(str2, str3);
        if (f0VarB2 == null) {
            f0 f0Var = new f0(strTrim, str2, str3);
            a(f0Var);
            return f0Var;
        }
        if (!z || strTrim.equals(str2)) {
            return f0VarB2;
        }
        f0 f0VarClone = f0VarB2.clone();
        f0VarClone.y = strTrim;
        a(f0VarClone);
        return f0VarClone;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            return Objects.equals(this.a, ((g0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
