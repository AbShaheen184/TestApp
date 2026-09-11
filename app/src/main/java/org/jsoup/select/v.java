package org.jsoup.select;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.parser.s0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements AutoCloseable {
    public static final char[] A = {'>', '+', '~'};
    public static final String[] B = {"=", "!=", "^=", "$=", "*=", "~="};
    public static final char[] C = {',', ')'};
    public static final Pattern D = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    public static final Pattern E = Pattern.compile("([+-])?(\\d+)");
    public final s0 e;
    public final String y;
    public boolean z;

    public v(String str) {
        org.jsoup.helper.n.E(str);
        String strTrim = str.trim();
        this.y = strTrim;
        this.e = new s0(strTrim);
    }

    public static p Z(String str) {
        try {
            v vVar = new v(str);
            try {
                p pVarB0 = vVar.b0();
                s0 s0Var = vVar.e;
                s0Var.w();
                org.jsoup.parser.a aVar = s0Var.e;
                if (!aVar.c0()) {
                    throw new androidx.media3.common.s("Could not parse query '%s': unexpected token at '%s'", vVar.y, aVar.a0());
                }
                vVar.close();
                return pVarB0;
            } catch (Throwable th) {
                try {
                    vVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalArgumentException e) {
            throw new androidx.media3.common.s(e.getMessage());
        }
        throw new androidx.media3.common.s(e.getMessage());
    }

    public static p a(p pVar, p pVar2) {
        if (pVar == null) {
            return pVar2;
        }
        if (!(pVar instanceof b)) {
            return new b(Arrays.asList(pVar, pVar2));
        }
        b bVar = (b) pVar;
        bVar.a.add(pVar2);
        bVar.g();
        return pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d A[PHI: r3
  0x001d: PHI (r3v7 int) = (r3v0 int), (r3v5 int) binds: [B:6:0x001b, B:18:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    public final n L(boolean z, boolean z2) {
        String strD = org.jsoup.internal.b.d(m());
        int i = 1;
        int i2 = 2;
        if (!"odd".equals(strD)) {
            if ("even".equals(strD)) {
                i = 0;
            } else {
                Matcher matcher = D.matcher(strD);
                if (matcher.matches()) {
                    if (matcher.group(3) != null) {
                        i2 = Integer.parseInt(matcher.group(1).replaceFirst("^\\+", ""));
                    } else {
                        i2 = "-".equals(matcher.group(2)) ? -1 : 1;
                    }
                    if (matcher.group(4) != null) {
                        i = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                    } else {
                        i = 0;
                    }
                } else {
                    Matcher matcher2 = E.matcher(strD);
                    if (!matcher2.matches()) {
                        throw new androidx.media3.common.s("Could not parse nth-index '%s': unexpected format", strD);
                    }
                    i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                    i2 = 0;
                }
            }
        }
        if (z2) {
            return z ? new n(i2, i, 2) : new n(i2, i, 3);
        }
        return z ? new n(i2, i, 1) : new n(i2, i, 0);
    }

    public final p N(s0 s0Var) {
        org.jsoup.parser.a aVar = s0Var.e;
        StringBuilder sbB = org.jsoup.internal.k.b();
        loop0: while (!aVar.c0()) {
            for (int i = 0; i < 6; i++) {
                if (aVar.j0(B[i])) {
                    break loop0;
                }
            }
            sbB.append(aVar.w());
        }
        String strD = org.jsoup.internal.b.d(org.jsoup.internal.k.l(sbB));
        org.jsoup.helper.n.E(strD);
        if (strD.equals("abs:")) {
            throw new org.jsoup.helper.o("Absolute attribute key must have a name");
        }
        s0Var.w();
        if (aVar.c0()) {
            if (strD.startsWith("^")) {
                return new h(strD.substring(1), 1);
            }
            return strD.equals("*") ? new h("", 1) : new h(0, strD, false);
        }
        if (s0Var.L('=')) {
            return new i(strD, aVar.a0(), 0);
        }
        if (aVar.f0("!=")) {
            return new i(strD, aVar.a0(), 3);
        }
        if (aVar.f0("^=")) {
            return new i(strD, aVar.a0(), 4);
        }
        if (aVar.f0("$=")) {
            return new i(strD, aVar.a0(), 2);
        }
        if (aVar.f0("*=")) {
            return new i(strD, aVar.a0(), 1);
        }
        if (aVar.f0("~=")) {
            return new j(strD, org.jsoup.helper.k.a(aVar.a0()));
        }
        throw new androidx.media3.common.s("Could not parse attribute query '%s': unexpected token at '%s'", this.y, aVar.a0());
    }

    public final p X(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        String strM = m();
        org.jsoup.helper.n.F(strM, str.concat("(regex) query must not be empty"));
        org.jsoup.helper.k kVarA = org.jsoup.helper.k.a(strM);
        if (this.z) {
            return new r(kVarA);
        }
        return z ? new o(kVarA, 1) : new o(kVarA, 0);
    }

    public final p Y(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        String strM = m();
        org.jsoup.helper.n.F(strM, str.concat("(regex) query must not be empty"));
        org.jsoup.helper.k kVarA = org.jsoup.helper.k.a(strM);
        return z ? new o(kVarA, 2) : new o(kVarA, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [org.jsoup.select.p] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [org.jsoup.select.p] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.jsoup.select.p] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.jsoup.select.c0, org.jsoup.select.z] */
    /* JADX WARN: Type inference failed for: r3v8, types: [org.jsoup.select.p] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final p a0() {
        s0 s0Var = this.e;
        s0Var.w();
        org.jsoup.parser.a aVar = s0Var.e;
        char[] cArr = A;
        ?? gVar = aVar.h0(cArr) ? new g(8) : c0();
        while (true) {
            char cW = s0Var.w() ? ' ' : (char) 0;
            if (!aVar.h0(cArr)) {
                if (!aVar.h0(C)) {
                    break;
                }
                break;
            }
            cW = aVar.w();
            if (cW == 0) {
                break;
            }
            p pVarC0 = c0();
            if (cW == ' ') {
                gVar = a(new x(gVar, 0), pVarC0);
            } else if (cW == '+') {
                gVar = a(new a0(gVar), pVarC0);
            } else if (cW == '>') {
                gVar = gVar instanceof z ? (z) gVar : new z(gVar);
                gVar.d.add(pVarC0);
                gVar.e = pVarC0.a() + gVar.e;
                gVar.b |= pVarC0.f();
            } else {
                if (cW != '~') {
                    throw new androidx.media3.common.s("Unknown combinator '%s'", Character.valueOf(cW));
                }
                gVar = a(new b0(gVar), pVarC0);
            }
        }
        return gVar;
    }

    public final p b0() {
        p pVarA0 = a0();
        while (this.e.L(',')) {
            p pVarA1 = a0();
            if (pVarA0 instanceof c) {
                c cVar = (c) pVarA0;
                cVar.a.add(pVarA1);
                cVar.g();
            } else {
                pVarA0 = new c(pVarA0, pVarA1);
            }
        }
        return pVarA0;
    }

    public final p c0() {
        p hVar;
        p pVarA;
        s0 s0Var = this.e;
        s0Var.w();
        org.jsoup.parser.a aVar = s0Var.e;
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        if (Character.isLetterOrDigit(aVar.b0()) || aVar.j0("*|")) {
            StringBuilder sbB = org.jsoup.internal.k.b();
            while (!aVar.c0()) {
                char cB0 = aVar.b0();
                if (cB0 != '\\') {
                    if (!Character.isLetterOrDigit(aVar.b0()) && !aVar.h0(s0.y)) {
                        break;
                    }
                    sbB.append(cB0);
                    s0Var.a();
                } else {
                    s0Var.a();
                    if (aVar.c0()) {
                        break;
                    }
                    sbB.append(aVar.w());
                }
            }
            String strD = org.jsoup.internal.b.d(org.jsoup.internal.k.l(sbB));
            org.jsoup.helper.n.E(strD);
            int i2 = 9;
            if (strD.startsWith("*|")) {
                String strSubstring = strD.substring(2);
                hVar = new c(new h(i2, strSubstring, b4 == true ? 1 : 0), new h(10, ":".concat(strSubstring), b3 == true ? 1 : 0));
            } else if (strD.endsWith("|*")) {
                hVar = new h(11, strD.substring(0, strD.length() - 2).concat(":"), b2 == true ? 1 : 0);
            } else {
                if (strD.contains("|")) {
                    strD = strD.replace("|", ":");
                }
                hVar = new h(i2, strD, b == true ? 1 : 0);
            }
            pVarA = hVar;
        } else {
            pVarA = s0Var.L('*') ? new g(i) : null;
        }
        while (true) {
            p pVarD0 = d0();
            if (pVarD0 == null) {
                break;
            }
            pVarA = a(pVarA, pVarD0);
        }
        if (pVarA != null) {
            return pVarA;
        }
        throw new androidx.media3.common.s("Could not parse query '%s': unexpected token at '%s'", this.y, aVar.a0());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:?, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r0.equals("leafnode") != true) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        r5 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if (r0.equals("comment") != true) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r0.equals("cdata") != true) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        r5 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        if (r0.equals("text") == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (r0.equals("node") != true) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        if (r0.equals("data") != true) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
    
        switch(r5) {
            case 0: goto L58;
            case 1: goto L57;
            case 2: goto L56;
            case 3: goto L55;
            case 4: goto L54;
            case 5: goto L53;
            default: goto L51;
        };
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v0 int, still in use, count: 4, list:
  (r5v0 int) from 0x00b8: PHI (r5v12 int) = 
  (r5v1 int)
  (r5v2 int)
  (r5v3 int)
  (r5v4 int)
  (r5v0 int)
  (r5v5 int)
  (r5v6 int)
  (r5v7 int)
  (r5v8 int)
  (r5v9 int)
  (r5v10 int)
  (r5v11 int)
  (r5v13 int)
 binds: [B:261:?, B:49:0x00b7, B:260:?, B:45:0x00ac, B:40:0x00a0, B:259:?, B:258:?, B:38:0x0098, B:257:?, B:34:0x008d, B:256:?, B:30:0x0082, B:26:0x0077] A[DONT_GENERATE, DONT_INLINE, REMOVE]
  (r5v0 int) from 0x0032: CONSTRUCTOR 
  (r5v0 int)
  (wrap java.lang.String:0x002e: INVOKE (r0v81 java.lang.String) VIRTUAL call: java.lang.String.trim():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:47))
  (r4v0 boolean)
 A[MD:(int, java.lang.String, boolean):void (m), REMOVE, WRAPPED] (LINE:51) call: org.jsoup.select.h.<init>(int, java.lang.String, boolean):void type: CONSTRUCTOR
  (r5v0 int) from 0x0310: CONSTRUCTOR 
  (wrap org.jsoup.select.p:0x030c: INVOKE (r0v59 java.lang.String) STATIC call: org.jsoup.select.v.Z(java.lang.String):org.jsoup.select.p A[MD:(java.lang.String):org.jsoup.select.p (m), WRAPPED] (LINE:781))
  (r5v0 int)
 A[MD:(org.jsoup.select.p, int):void (m), REMOVE, WRAPPED] (LINE:785) call: org.jsoup.select.x.<init>(org.jsoup.select.p, int):void type: CONSTRUCTOR
  (r5v0 int) from 0x0391: CONSTRUCTOR (r5v0 int) A[MD:(int):void (m), REMOVE, WRAPPED] (LINE:914) call: org.jsoup.select.g.<init>(int):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.jsoup.select.p d0() {
        /*
            Method dump skipped, instruction units count: 1160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.v.d0():org.jsoup.select.p");
    }

    public final int g() {
        String strTrim = m().trim();
        boolean z = false;
        if (strTrim != null && strTrim.length() != 0) {
            int length = strTrim.length();
            for (int i = 0; i < length; i++) {
                if (org.jsoup.internal.k.g(strTrim.charAt(i))) {
                }
            }
            z = true;
        }
        org.jsoup.helper.n.B("Index must be numeric", z);
        return Integer.parseInt(strTrim);
    }

    public final String m() {
        return this.e.g('(', ')');
    }

    public final String toString() {
        return this.y;
    }

    public final p w(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        String strN = s0.N(m());
        org.jsoup.helper.n.F(strN, str.concat("(text) query must not be empty"));
        if (this.z) {
            return new r(strN);
        }
        return z ? new h(strN, 4) : new h(strN, 5);
    }

    public final p z(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        String strN = s0.N(m());
        org.jsoup.helper.n.F(strN, str.concat("(text) query must not be empty"));
        return z ? new h(6, strN, false) : new h(7, strN, false);
    }
}
