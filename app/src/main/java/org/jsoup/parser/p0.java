package org.jsoup.parser;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p0 {
    public static /* synthetic */ boolean a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return false;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                return true;
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case Token.GETPROP /* 33 */:
                return false;
            case Token.GETPROPNOWARN /* 34 */:
            case 35:
                return true;
            case Token.GETPROPNOWARN_SUPER /* 36 */:
                return false;
            case Token.SETPROP /* 37 */:
            case Token.SETPROP_SUPER /* 38 */:
            case Token.GETELEM /* 39 */:
                return true;
            case Token.GETELEM_SUPER /* 40 */:
                return false;
            case Token.SETELEM /* 41 */:
                return true;
            case Token.SETELEM_SUPER /* 42 */:
            case Token.CALL /* 43 */:
            case Token.NAME /* 44 */:
            case Token.NUMBER /* 45 */:
            case Token.STRING /* 46 */:
            case Token.NULL /* 47 */:
            case Token.THIS /* 48 */:
            case Token.FALSE /* 49 */:
            case Token.TRUE /* 50 */:
            case Token.SHEQ /* 51 */:
                return false;
            case Token.SHNE /* 52 */:
            case Token.REGEXP /* 53 */:
            case Token.BINDNAME /* 54 */:
            case Token.THROW /* 55 */:
            case Token.RETHROW /* 56 */:
            case Token.IN /* 57 */:
            case Token.INSTANCEOF /* 58 */:
            case Token.LOCAL_LOAD /* 59 */:
            case 60:
            case 61:
            case Token.CATCH_SCOPE /* 62 */:
            case Token.ENUM_INIT_KEYS /* 63 */:
            case Token.ENUM_INIT_VALUES /* 64 */:
            case Token.ENUM_INIT_ARRAY /* 65 */:
            case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
            case Token.ENUM_NEXT /* 67 */:
            case Token.ENUM_ID /* 68 */:
            case Token.THISFN /* 69 */:
            case Token.RETURN_RESULT /* 70 */:
                return true;
            case Token.ARRAYLIT /* 71 */:
            case Token.OBJECTLIT /* 72 */:
            case Token.GET_REF /* 73 */:
            case Token.SET_REF /* 74 */:
            case Token.DEL_REF /* 75 */:
            case Token.REF_CALL /* 76 */:
            case Token.REF_SPECIAL /* 77 */:
            case Token.YIELD /* 78 */:
            case Token.SUPER /* 79 */:
            case Token.STRICT_SETNAME /* 80 */:
            case Token.EXP /* 81 */:
            case Token.DEFAULTNAMESPACE /* 82 */:
            case Token.ESCXMLATTR /* 83 */:
            case Token.ESCXMLTEXT /* 84 */:
            case Token.REF_MEMBER /* 85 */:
            case Token.REF_NS_MEMBER /* 86 */:
            case Token.REF_NAME /* 87 */:
            case Token.REF_NS_NAME /* 88 */:
                return false;
            case 89:
                return true;
            case Token.TRY /* 90 */:
            case Token.SEMI /* 91 */:
            case Token.LB /* 92 */:
            case Token.RB /* 93 */:
            case Token.LC /* 94 */:
            case Token.RC /* 95 */:
            case Token.LP /* 96 */:
            case Token.RP /* 97 */:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ boolean b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return false;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                return true;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case Token.GETPROP /* 33 */:
                return false;
            case Token.GETPROPNOWARN /* 34 */:
            case 35:
                return true;
            case Token.GETPROPNOWARN_SUPER /* 36 */:
            case Token.SETPROP /* 37 */:
            case Token.SETPROP_SUPER /* 38 */:
            case Token.GETELEM /* 39 */:
            case Token.GETELEM_SUPER /* 40 */:
                return false;
            case Token.SETELEM /* 41 */:
                return true;
            case Token.SETELEM_SUPER /* 42 */:
            case Token.CALL /* 43 */:
                return false;
            case Token.NAME /* 44 */:
            case Token.NUMBER /* 45 */:
            case Token.STRING /* 46 */:
            case Token.NULL /* 47 */:
            case Token.THIS /* 48 */:
            case Token.FALSE /* 49 */:
            case Token.TRUE /* 50 */:
            case Token.SHEQ /* 51 */:
            case Token.SHNE /* 52 */:
            case Token.REGEXP /* 53 */:
            case Token.BINDNAME /* 54 */:
            case Token.THROW /* 55 */:
            case Token.RETHROW /* 56 */:
            case Token.IN /* 57 */:
            case Token.INSTANCEOF /* 58 */:
            case Token.LOCAL_LOAD /* 59 */:
            case 60:
            case 61:
            case Token.CATCH_SCOPE /* 62 */:
            case Token.ENUM_INIT_KEYS /* 63 */:
            case Token.ENUM_INIT_VALUES /* 64 */:
            case Token.ENUM_INIT_ARRAY /* 65 */:
            case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
            case Token.ENUM_NEXT /* 67 */:
            case Token.ENUM_ID /* 68 */:
            case Token.THISFN /* 69 */:
            case Token.RETURN_RESULT /* 70 */:
            case Token.ARRAYLIT /* 71 */:
                return true;
            case Token.OBJECTLIT /* 72 */:
            case Token.GET_REF /* 73 */:
            case Token.SET_REF /* 74 */:
            case Token.DEL_REF /* 75 */:
            case Token.REF_CALL /* 76 */:
            case Token.REF_SPECIAL /* 77 */:
            case Token.YIELD /* 78 */:
            case Token.SUPER /* 79 */:
            case Token.STRICT_SETNAME /* 80 */:
            case Token.EXP /* 81 */:
            case Token.DEFAULTNAMESPACE /* 82 */:
            case Token.ESCXMLATTR /* 83 */:
            case Token.ESCXMLTEXT /* 84 */:
            case Token.REF_MEMBER /* 85 */:
            case Token.REF_NS_MEMBER /* 86 */:
            case Token.REF_NAME /* 87 */:
            case Token.REF_NS_NAME /* 88 */:
            case 89:
            case Token.TRY /* 90 */:
            case Token.SEMI /* 91 */:
            case Token.LB /* 92 */:
            case Token.RB /* 93 */:
            case Token.LC /* 94 */:
                return false;
            case Token.RC /* 95 */:
                return true;
            case Token.LP /* 96 */:
            case Token.RP /* 97 */:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ Map c(List list) {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("Range", list)};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        Objects.requireNonNull(key);
        Object value = entry.getValue();
        Objects.requireNonNull(value);
        if (map.put(key, value) == null) {
            return Collections.unmodifiableMap(map);
        }
        net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.o(key, "duplicate key: "));
        return null;
    }

    public static void d(int i, HashMap map, String str, int i2, String str2) {
        map.put(Integer.valueOf(i), str);
        map.put(Integer.valueOf(i2), str2);
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "Doctype";
            case 2:
                return "StartTag";
            case 3:
                return "EndTag";
            case 4:
                return "Comment";
            case 5:
                return "Character";
            case 6:
                return "XmlDecl";
            case 7:
                return "EOF";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "HIGH";
        }
        if (i == 2) {
            return "MEDIUM";
        }
        if (i != 3) {
            return i != 4 ? "null" : "UNKNOWN";
        }
        return "LOW";
    }

    public static /* synthetic */ String g(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "VIDEO_STREAM";
            case 3:
                return "AUDIO_STREAM";
            case 4:
                return "LIVE_STREAM";
            case 5:
                return "AUDIO_LIVE_STREAM";
            case 6:
                return "POST_LIVE_STREAM";
            case 7:
                return "POST_LIVE_AUDIO_STREAM";
            default:
                return "null";
        }
    }
}
