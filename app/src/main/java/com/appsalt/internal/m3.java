package com.appsalt.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m3 {
    public static final String[] a = a("creapslpinut.com; gapslpinch.com", "");
    public static final String[] b = a("grasplpond.com; clapslport.com", "");
    public static final String[] c = a("scapslwshell.com; trapslwsin.com", "wss://");

    public static String[] a(String str, String str2) {
        List listP0 = kotlin.text.k.p0(new String[]{";", " ", ",", "\t", "\n", "\r\n", "\r"}, kotlin.text.k.A0(str).toString(), 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listP0.iterator();
        while (it.hasNext()) {
            String string = kotlin.text.k.A0((String) it.next()).toString();
            String strConcat = kotlin.text.k.d0(string) ? null : str2.concat(string);
            if (strConcat != null) {
                arrayList.add(strConcat);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
