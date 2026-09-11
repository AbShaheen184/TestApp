package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final kotlin.text.i m = new kotlin.text.i("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final kotlin.text.i n = new kotlin.text.i("\\{(.+?)\\}");
    public static final kotlin.text.i o = new kotlin.text.i("http[s]?://");
    public static final kotlin.text.i p = new kotlin.text.i(".*");
    public static final kotlin.text.i q = new kotlin.text.i("([^/]*?|)");
    public static final kotlin.text.i r = new kotlin.text.i("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final kotlin.o d;
    public final kotlin.o e;
    public final Object f;
    public boolean g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final kotlin.o k;
    public final boolean l;

    public r(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        final int i = 0;
        this.d = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: androidx.navigation.o
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.h] */
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                List list;
                switch (i) {
                    case 0:
                        String str2 = this.y.c;
                        if (str2 != null) {
                            return new kotlin.text.i(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(r.r.e(this.y.a));
                    case 2:
                        r rVar = this.y;
                        String str3 = rVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) rVar.e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri uri = Uri.parse(str3);
                        uri.getClass();
                        for (String str4 : uri.getQueryParameterNames()) {
                            StringBuilder sb = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str5 = (String) kotlin.collections.o.M(queryParameters);
                            if (str5 == null) {
                                rVar.g = true;
                                str5 = str4;
                            }
                            q qVar = new q();
                            int i2 = 0;
                            for (kotlin.text.g gVarA = r.n.a(str5); gVarA != null; gVarA = gVarA.c()) {
                                kotlin.text.f fVarC = gVarA.c.c(1);
                                fVarC.getClass();
                                qVar.b.add(fVarC.a);
                                if (gVarA.b().e > i2) {
                                    String strQuote = Pattern.quote(str5.substring(i2, gVarA.b().e));
                                    strQuote.getClass();
                                    sb.append(strQuote);
                                }
                                sb.append("([\\s\\S]+?)?");
                                i2 = gVarA.b().y + 1;
                            }
                            if (i2 < str5.length()) {
                                String strQuote2 = Pattern.quote(str5.substring(i2));
                                strQuote2.getClass();
                                sb.append(strQuote2);
                            }
                            sb.append("$");
                            qVar.a = r.h(sb.toString());
                            linkedHashMap.put(str4, qVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.y.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        r.a(fragment, arrayList2, sb2);
                        return new kotlin.k(arrayList2, sb2.toString());
                    case 4:
                        kotlin.k kVar = (kotlin.k) this.y.h.getValue();
                        return (kVar == null || (list = (List) kVar.e) == null) ? new ArrayList() : list;
                    case 5:
                        kotlin.k kVar2 = (kotlin.k) this.y.h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.y;
                        }
                        return null;
                    case 6:
                        String str7 = (String) this.y.j.getValue();
                        if (str7 != null) {
                            return new kotlin.text.i(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.e = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: androidx.navigation.o
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.h] */
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                List list;
                switch (i2) {
                    case 0:
                        String str2 = this.y.c;
                        if (str2 != null) {
                            return new kotlin.text.i(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(r.r.e(this.y.a));
                    case 2:
                        r rVar = this.y;
                        String str3 = rVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) rVar.e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri uri = Uri.parse(str3);
                        uri.getClass();
                        for (String str4 : uri.getQueryParameterNames()) {
                            StringBuilder sb = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str5 = (String) kotlin.collections.o.M(queryParameters);
                            if (str5 == null) {
                                rVar.g = true;
                                str5 = str4;
                            }
                            q qVar = new q();
                            int i3 = 0;
                            for (kotlin.text.g gVarA = r.n.a(str5); gVarA != null; gVarA = gVarA.c()) {
                                kotlin.text.f fVarC = gVarA.c.c(1);
                                fVarC.getClass();
                                qVar.b.add(fVarC.a);
                                if (gVarA.b().e > i3) {
                                    String strQuote = Pattern.quote(str5.substring(i3, gVarA.b().e));
                                    strQuote.getClass();
                                    sb.append(strQuote);
                                }
                                sb.append("([\\s\\S]+?)?");
                                i3 = gVarA.b().y + 1;
                            }
                            if (i3 < str5.length()) {
                                String strQuote2 = Pattern.quote(str5.substring(i3));
                                strQuote2.getClass();
                                sb.append(strQuote2);
                            }
                            sb.append("$");
                            qVar.a = r.h(sb.toString());
                            linkedHashMap.put(str4, qVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.y.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        r.a(fragment, arrayList2, sb2);
                        return new kotlin.k(arrayList2, sb2.toString());
                    case 4:
                        kotlin.k kVar = (kotlin.k) this.y.h.getValue();
                        return (kVar == null || (list = (List) kVar.e) == null) ? new ArrayList() : list;
                    case 5:
                        kotlin.k kVar2 = (kotlin.k) this.y.h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.y;
                        }
                        return null;
                    case 6:
                        String str7 = (String) this.y.j.getValue();
                        if (str7 != null) {
                            return new kotlin.text.i(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i3 = 2;
        kotlin.jvm.functions.a aVar = new kotlin.jvm.functions.a(this) { // from class: androidx.navigation.o
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.h] */
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                List list;
                switch (i3) {
                    case 0:
                        String str2 = this.y.c;
                        if (str2 != null) {
                            return new kotlin.text.i(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(r.r.e(this.y.a));
                    case 2:
                        r rVar = this.y;
                        String str3 = rVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) rVar.e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri uri = Uri.parse(str3);
                        uri.getClass();
                        for (String str4 : uri.getQueryParameterNames()) {
                            StringBuilder sb = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str5 = (String) kotlin.collections.o.M(queryParameters);
                            if (str5 == null) {
                                rVar.g = true;
                                str5 = str4;
                            }
                            q qVar = new q();
                            int i4 = 0;
                            for (kotlin.text.g gVarA = r.n.a(str5); gVarA != null; gVarA = gVarA.c()) {
                                kotlin.text.f fVarC = gVarA.c.c(1);
                                fVarC.getClass();
                                qVar.b.add(fVarC.a);
                                if (gVarA.b().e > i4) {
                                    String strQuote = Pattern.quote(str5.substring(i4, gVarA.b().e));
                                    strQuote.getClass();
                                    sb.append(strQuote);
                                }
                                sb.append("([\\s\\S]+?)?");
                                i4 = gVarA.b().y + 1;
                            }
                            if (i4 < str5.length()) {
                                String strQuote2 = Pattern.quote(str5.substring(i4));
                                strQuote2.getClass();
                                sb.append(strQuote2);
                            }
                            sb.append("$");
                            qVar.a = r.h(sb.toString());
                            linkedHashMap.put(str4, qVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.y.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        r.a(fragment, arrayList2, sb2);
                        return new kotlin.k(arrayList2, sb2.toString());
                    case 4:
                        kotlin.k kVar = (kotlin.k) this.y.h.getValue();
                        return (kVar == null || (list = (List) kVar.e) == null) ? new ArrayList() : list;
                    case 5:
                        kotlin.k kVar2 = (kotlin.k) this.y.h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.y;
                        }
                        return null;
                    case 6:
                        String str7 = (String) this.y.j.getValue();
                        if (str7 != null) {
                            return new kotlin.text.i(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        kotlin.i iVar = kotlin.i.y;
        this.f = kotlin.a.c(iVar, aVar);
        final int i4 = 3;
        this.h = kotlin.a.c(iVar, new kotlin.jvm.functions.a(this) { // from class: androidx.navigation.o
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.h] */
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                List list;
                switch (i4) {
                    case 0:
                        String str2 = this.y.c;
                        if (str2 != null) {
                            return new kotlin.text.i(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(r.r.e(this.y.a));
                    case 2:
                        r rVar = this.y;
                        String str3 = rVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) rVar.e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri uri = Uri.parse(str3);
                        uri.getClass();
                        for (String str4 : uri.getQueryParameterNames()) {
                            StringBuilder sb = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str5 = (String) kotlin.collections.o.M(queryParameters);
                            if (str5 == null) {
                                rVar.g = true;
                                str5 = str4;
                            }
                            q qVar = new q();
                            int i5 = 0;
                            for (kotlin.text.g gVarA = r.n.a(str5); gVarA != null; gVarA = gVarA.c()) {
                                kotlin.text.f fVarC = gVarA.c.c(1);
                                fVarC.getClass();
                                qVar.b.add(fVarC.a);
                                if (gVarA.b().e > i5) {
                                    String strQuote = Pattern.quote(str5.substring(i5, gVarA.b().e));
                                    strQuote.getClass();
                                    sb.append(strQuote);
                                }
                                sb.append("([\\s\\S]+?)?");
                                i5 = gVarA.b().y + 1;
                            }
                            if (i5 < str5.length()) {
                                String strQuote2 = Pattern.quote(str5.substring(i5));
                                strQuote2.getClass();
                                sb.append(strQuote2);
                            }
                            sb.append("$");
                            qVar.a = r.h(sb.toString());
                            linkedHashMap.put(str4, qVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.y.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        r.a(fragment, arrayList2, sb2);
                        return new kotlin.k(arrayList2, sb2.toString());
                    case 4:
                        kotlin.k kVar = (kotlin.k) this.y.h.getValue();
                        return (kVar == null || (list = (List) kVar.e) == null) ? new ArrayList() : list;
                    case 5:
                        kotlin.k kVar2 = (kotlin.k) this.y.h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.y;
                        }
                        return null;
                    case 6:
                        String str7 = (String) this.y.j.getValue();
                        if (str7 != null) {
                            return new kotlin.text.i(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.i = kotlin.a.c(iVar, new kotlin.jvm.functions.a(this) { // from class: androidx.navigation.o
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.h] */
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                List list;
                switch (i5) {
                    case 0:
                        String str2 = this.y.c;
                        if (str2 != null) {
                            return new kotlin.text.i(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(r.r.e(this.y.a));
                    case 2:
                        r rVar = this.y;
                        String str3 = rVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) rVar.e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri uri = Uri.parse(str3);
                        uri.getClass();
                        for (String str4 : uri.getQueryParameterNames()) {
                            StringBuilder sb = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str5 = (String) kotlin.collections.o.M(queryParameters);
                            if (str5 == null) {
                                rVar.g = true;
                                str5 = str4;
                            }
                            q qVar = new q();
                            int i6 = 0;
                            for (kotlin.text.g gVarA = r.n.a(str5); gVarA != null; gVarA = gVarA.c()) {
                                kotlin.text.f fVarC = gVarA.c.c(1);
                                fVarC.getClass();
                                qVar.b.add(fVarC.a);
                                if (gVarA.b().e > i6) {
                                    String strQuote = Pattern.quote(str5.substring(i6, gVarA.b().e));
                                    strQuote.getClass();
                                    sb.append(strQuote);
                                }
                                sb.append("([\\s\\S]+?)?");
                                i6 = gVarA.b().y + 1;
                            }
                            if (i6 < str5.length()) {
                                String strQuote2 = Pattern.quote(str5.substring(i6));
                                strQuote2.getClass();
                                sb.append(strQuote2);
                            }
                            sb.append("$");
                            qVar.a = r.h(sb.toString());
                            linkedHashMap.put(str4, qVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.y.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        r.a(fragment, arrayList2, sb2);
                        return new kotlin.k(arrayList2, sb2.toString());
                    case 4:
                        kotlin.k kVar = (kotlin.k) this.y.h.getValue();
                        return (kVar == null || (list = (List) kVar.e) == null) ? new ArrayList() : list;
                    case 5:
                        kotlin.k kVar2 = (kotlin.k) this.y.h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.y;
                        }
                        return null;
                    case 6:
                        String str7 = (String) this.y.j.getValue();
                        if (str7 != null) {
                            return new kotlin.text.i(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.j = kotlin.a.c(iVar, new kotlin.jvm.functions.a(this) { // from class: androidx.navigation.o
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.h] */
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                List list;
                switch (i6) {
                    case 0:
                        String str2 = this.y.c;
                        if (str2 != null) {
                            return new kotlin.text.i(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(r.r.e(this.y.a));
                    case 2:
                        r rVar = this.y;
                        String str3 = rVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) rVar.e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri uri = Uri.parse(str3);
                        uri.getClass();
                        for (String str4 : uri.getQueryParameterNames()) {
                            StringBuilder sb = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str5 = (String) kotlin.collections.o.M(queryParameters);
                            if (str5 == null) {
                                rVar.g = true;
                                str5 = str4;
                            }
                            q qVar = new q();
                            int i7 = 0;
                            for (kotlin.text.g gVarA = r.n.a(str5); gVarA != null; gVarA = gVarA.c()) {
                                kotlin.text.f fVarC = gVarA.c.c(1);
                                fVarC.getClass();
                                qVar.b.add(fVarC.a);
                                if (gVarA.b().e > i7) {
                                    String strQuote = Pattern.quote(str5.substring(i7, gVarA.b().e));
                                    strQuote.getClass();
                                    sb.append(strQuote);
                                }
                                sb.append("([\\s\\S]+?)?");
                                i7 = gVarA.b().y + 1;
                            }
                            if (i7 < str5.length()) {
                                String strQuote2 = Pattern.quote(str5.substring(i7));
                                strQuote2.getClass();
                                sb.append(strQuote2);
                            }
                            sb.append("$");
                            qVar.a = r.h(sb.toString());
                            linkedHashMap.put(str4, qVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.y.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        r.a(fragment, arrayList2, sb2);
                        return new kotlin.k(arrayList2, sb2.toString());
                    case 4:
                        kotlin.k kVar = (kotlin.k) this.y.h.getValue();
                        return (kVar == null || (list = (List) kVar.e) == null) ? new ArrayList() : list;
                    case 5:
                        kotlin.k kVar2 = (kotlin.k) this.y.h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.y;
                        }
                        return null;
                    case 6:
                        String str7 = (String) this.y.j.getValue();
                        if (str7 != null) {
                            return new kotlin.text.i(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.k = new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: androidx.navigation.o
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.h] */
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                List list;
                switch (i7) {
                    case 0:
                        String str2 = this.y.c;
                        if (str2 != null) {
                            return new kotlin.text.i(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(r.r.e(this.y.a));
                    case 2:
                        r rVar = this.y;
                        String str3 = rVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) rVar.e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri uri = Uri.parse(str3);
                        uri.getClass();
                        for (String str4 : uri.getQueryParameterNames()) {
                            StringBuilder sb = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str5 = (String) kotlin.collections.o.M(queryParameters);
                            if (str5 == null) {
                                rVar.g = true;
                                str5 = str4;
                            }
                            q qVar = new q();
                            int i8 = 0;
                            for (kotlin.text.g gVarA = r.n.a(str5); gVarA != null; gVarA = gVarA.c()) {
                                kotlin.text.f fVarC = gVarA.c.c(1);
                                fVarC.getClass();
                                qVar.b.add(fVarC.a);
                                if (gVarA.b().e > i8) {
                                    String strQuote = Pattern.quote(str5.substring(i8, gVarA.b().e));
                                    strQuote.getClass();
                                    sb.append(strQuote);
                                }
                                sb.append("([\\s\\S]+?)?");
                                i8 = gVarA.b().y + 1;
                            }
                            if (i8 < str5.length()) {
                                String strQuote2 = Pattern.quote(str5.substring(i8));
                                strQuote2.getClass();
                                sb.append(strQuote2);
                            }
                            sb.append("$");
                            qVar.a = r.h(sb.toString());
                            linkedHashMap.put(str4, qVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.y.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        r.a(fragment, arrayList2, sb2);
                        return new kotlin.k(arrayList2, sb2.toString());
                    case 4:
                        kotlin.k kVar = (kotlin.k) this.y.h.getValue();
                        return (kVar == null || (list = (List) kVar.e) == null) ? new ArrayList() : list;
                    case 5:
                        kotlin.k kVar2 = (kotlin.k) this.y.h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.y;
                        }
                        return null;
                    case 6:
                        String str7 = (String) this.y.j.getValue();
                        if (str7 != null) {
                            return new kotlin.text.i(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 7;
        new kotlin.o(new kotlin.jvm.functions.a(this) { // from class: androidx.navigation.o
            public final /* synthetic */ r y;

            {
                this.y = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.h] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.h] */
            @Override // kotlin.jvm.functions.a
            public final Object invoke() {
                List list;
                switch (i8) {
                    case 0:
                        String str2 = this.y.c;
                        if (str2 != null) {
                            return new kotlin.text.i(str2, 0);
                        }
                        return null;
                    case 1:
                        return Boolean.valueOf(r.r.e(this.y.a));
                    case 2:
                        r rVar = this.y;
                        String str3 = rVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (!((Boolean) rVar.e.getValue()).booleanValue()) {
                            return linkedHashMap;
                        }
                        Uri uri = Uri.parse(str3);
                        uri.getClass();
                        for (String str4 : uri.getQueryParameterNames()) {
                            StringBuilder sb = new StringBuilder();
                            List<String> queryParameters = uri.getQueryParameters(str4);
                            if (queryParameters.size() > 1) {
                                net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Query parameter ", str4, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                return null;
                            }
                            String str5 = (String) kotlin.collections.o.M(queryParameters);
                            if (str5 == null) {
                                rVar.g = true;
                                str5 = str4;
                            }
                            q qVar = new q();
                            int i9 = 0;
                            for (kotlin.text.g gVarA = r.n.a(str5); gVarA != null; gVarA = gVarA.c()) {
                                kotlin.text.f fVarC = gVarA.c.c(1);
                                fVarC.getClass();
                                qVar.b.add(fVarC.a);
                                if (gVarA.b().e > i9) {
                                    String strQuote = Pattern.quote(str5.substring(i9, gVarA.b().e));
                                    strQuote.getClass();
                                    sb.append(strQuote);
                                }
                                sb.append("([\\s\\S]+?)?");
                                i9 = gVarA.b().y + 1;
                            }
                            if (i9 < str5.length()) {
                                String strQuote2 = Pattern.quote(str5.substring(i9));
                                strQuote2.getClass();
                                sb.append(strQuote2);
                            }
                            sb.append("$");
                            qVar.a = r.h(sb.toString());
                            linkedHashMap.put(str4, qVar);
                        }
                        return linkedHashMap;
                    case 3:
                        String str6 = this.y.a;
                        Uri uri2 = Uri.parse(str6);
                        uri2.getClass();
                        if (uri2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri uri3 = Uri.parse(str6);
                        uri3.getClass();
                        String fragment = uri3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        r.a(fragment, arrayList2, sb2);
                        return new kotlin.k(arrayList2, sb2.toString());
                    case 4:
                        kotlin.k kVar = (kotlin.k) this.y.h.getValue();
                        return (kVar == null || (list = (List) kVar.e) == null) ? new ArrayList() : list;
                    case 5:
                        kotlin.k kVar2 = (kotlin.k) this.y.h.getValue();
                        if (kVar2 != null) {
                            return (String) kVar2.y;
                        }
                        return null;
                    case 6:
                        String str7 = (String) this.y.j.getValue();
                        if (str7 != null) {
                            return new kotlin.text.i(str7, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!m.e.matcher(str).find()) {
            String strPattern = o.e.pattern();
            strPattern.getClass();
            sb.append(strPattern);
        }
        boolean z = false;
        kotlin.text.g gVarQ = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.q("(\\?|#|$)", 0, str, str);
        if (gVarQ != null) {
            a(str.substring(0, gVarQ.b().e), arrayList, sb);
            if (!p.e.matcher(sb).find() && !q.e.matcher(sb).find()) {
                z = true;
            }
            this.l = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.c = h(sb.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (kotlin.text.g gVarA = n.a(str); gVarA != null; gVarA = gVarA.c()) {
            kotlin.text.f fVarC = gVarA.c.c(1);
            fVarC.getClass();
            arrayList.add(fVarC.a);
            if (gVarA.b().e > i) {
                String strQuote = Pattern.quote(str.substring(i, gVarA.b().e));
                strQuote.getClass();
                sb.append(strQuote);
            }
            String strPattern = q.e.pattern();
            strPattern.getClass();
            sb.append(strPattern);
            i = gVarA.b().y + 1;
        }
        if (i < str.length()) {
            String strQuote2 = Pattern.quote(str.substring(i));
            strQuote2.getClass();
            sb.append(strQuote2);
        }
    }

    public static void g(Bundle bundle, String str, String str2, g gVar) {
        if (gVar == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            i0 i0Var = gVar.a;
            str.getClass();
            i0Var.e(bundle, str, i0Var.d(str2));
        }
    }

    public static String h(String str) {
        if (kotlin.text.k.T(str, "\\Q", false) && kotlin.text.k.T(str, "\\E", false)) {
            return kotlin.text.r.M(str, ".*", "\\E.*\\Q", false);
        }
        return kotlin.text.k.T(str, "\\.\\*", false) ? kotlin.text.r.M(str, "\\.\\*", ".*", false) : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(this.a);
        uri2.getClass();
        List<String> pathSegments2 = uri2.getPathSegments();
        pathSegments.getClass();
        pathSegments2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : pathSegments) {
            if (pathSegments2.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.h] */
    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            kotlin.collections.o.C(arrayList, ((q) it.next()).b);
        }
        return kotlin.collections.o.X(kotlin.collections.o.X(this.b, arrayList), (List) this.i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.h] */
    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        kotlin.text.g gVarD;
        kotlin.text.g gVarD2;
        String strDecode;
        uri.getClass();
        linkedHashMap.getClass();
        kotlin.text.i iVar = (kotlin.text.i) this.d.getValue();
        if (iVar != null && (gVarD = iVar.d(uri.toString())) != null) {
            int i = 0;
            Bundle bundleI = coil3.network.g.i((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
            if (e(gVarD, bundleI, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, bundleI, linkedHashMap))) {
                String fragment = uri.getFragment();
                kotlin.text.i iVar2 = (kotlin.text.i) this.k.getValue();
                if (iVar2 != null && (gVarD2 = iVar2.d(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            com.google.common.base.c.w();
                            throw null;
                        }
                        String str = (String) obj;
                        kotlin.text.f fVarC = gVarD2.c.c(i2);
                        if (fVarC != null) {
                            strDecode = Uri.decode(fVarC.a);
                            strDecode.getClass();
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            g(bundleI, str, strDecode, (g) linkedHashMap.get(str));
                            arrayList.add(kotlin.y.a);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (f.e(linkedHashMap, new p(0, bundleI)).isEmpty()) {
                    return bundleI;
                }
            }
        }
        return null;
    }

    public final boolean e(kotlin.text.g gVar, Bundle bundle, Map map) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.p.y(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            String strDecode = null;
            if (i < 0) {
                com.google.common.base.c.w();
                throw null;
            }
            String str = (String) obj;
            kotlin.text.f fVarC = gVar.c.c(i2);
            if (fVarC != null) {
                strDecode = Uri.decode(fVarC.a);
                strDecode.getClass();
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                g(bundle, str, strDecode, (g) map.get(str));
                arrayList2.add(kotlin.y.a);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        return this.a.equals(((r) obj).a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.h] */
    public final boolean f(Uri uri, Bundle bundle, Map map) {
        kotlin.text.g gVar;
        Object objValueOf;
        boolean z;
        Object obj;
        String query;
        for (Map.Entry entry : ((Map) this.f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            q qVar = (q) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = com.google.common.base.c.p(query);
            }
            Object obj2 = kotlin.y.a;
            boolean z2 = false;
            Bundle bundleI = coil3.network.g.i((kotlin.k[]) Arrays.copyOf(new kotlin.k[0], 0));
            for (String str2 : qVar.b) {
                g gVar2 = (g) map.get(str2);
                i0 i0Var = gVar2 != null ? gVar2.a : null;
                if ((i0Var instanceof c) && !gVar2.b) {
                    c cVar = (c) i0Var;
                    switch (cVar.k) {
                        case 0:
                            obj = new boolean[0];
                            break;
                        case 1:
                            obj = new float[0];
                            break;
                        case 2:
                            obj = new int[0];
                            break;
                        case 3:
                            obj = new long[0];
                            break;
                        default:
                            obj = new String[0];
                            break;
                    }
                    cVar.e(bundleI, str2, obj);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = qVar.a;
                if (str4 != null) {
                    Pattern patternCompile = Pattern.compile(str4);
                    patternCompile.getClass();
                    str3.getClass();
                    Matcher matcher = patternCompile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        gVar = new kotlin.text.g(matcher, str3);
                    } else {
                        gVar = null;
                    }
                } else {
                    gVar = null;
                }
                if (gVar == null) {
                    return z2;
                }
                ArrayList arrayList = qVar.b;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.p.y(arrayList, 10));
                ?? r14 = z2;
                for (Object obj3 : arrayList) {
                    int i = r14 + 1;
                    if (r14 < 0) {
                        com.google.common.base.c.w();
                        throw null;
                    }
                    String str5 = (String) obj3;
                    kotlin.text.f fVarC = gVar.c.c(i);
                    String str6 = fVarC != null ? fVarC.a : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    g gVar3 = (g) map.get(str5);
                    try {
                        str5.getClass();
                        if (bundleI.containsKey(str5)) {
                            if (bundleI.containsKey(str5)) {
                                if (gVar3 != null) {
                                    i0 i0Var2 = gVar3.a;
                                    Object objA = i0Var2.a(str5, bundleI);
                                    if (!bundleI.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    i0Var2.e(bundleI, str5, i0Var2.c(objA, str6));
                                    objValueOf = obj2;
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            try {
                                objValueOf = Boolean.valueOf(z);
                            } catch (IllegalArgumentException unused) {
                                objValueOf = obj2;
                            }
                        } else {
                            g(bundleI, str5, str6, gVar3);
                            objValueOf = obj2;
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                    arrayList2.add(objValueOf);
                    r14 = i;
                    z2 = false;
                }
            }
            bundle.putAll(bundleI);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
